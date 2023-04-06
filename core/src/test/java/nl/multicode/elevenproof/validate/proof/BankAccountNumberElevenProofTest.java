package nl.multicode.elevenproof.validate.proof;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountNumberElevenProofTest {

  BankAccountNumberElevenProof elevenProof;

  @BeforeEach
  public void setup() {

    elevenProof = new BankAccountNumberElevenProof();
  }

  @Test
  void isElevenProof() {

    assertThat(elevenProof.test(new int[]{0, 4, 8, 4, 8, 4, 8, 4, 8, 8})).isTrue();
  }

  @Test
  void isNotElevenProof() {

    assertThat(elevenProof.test(new int[]{1, 2, 3, 4, 8, 8, 8, 8, 8,})).isFalse();
  }
}