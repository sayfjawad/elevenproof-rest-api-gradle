package nl.multicode.elevenproof.validate.proof;

import nl.multicode.elevenproof.validate.ElevenProof;

public class BsnElevenProof implements ElevenProof {

  private static final int[] BSN_ONDNR_MULTIPLIERS = {9, 8, 7, 6, 5, 4, 3, 2, -1};

  @Override
  public boolean test(int[] bsn) {

    return bsn != null &&
        bsn.length == BSN_ONDNR_MULTIPLIERS.length &&
        test(bsn, BSN_ONDNR_MULTIPLIERS);
  }
}
