package org.chromium.support_lib_boundary;

public interface WebMessagePayloadBoundaryInterface extends FeatureFlagHolderBoundaryInterface {
    byte[] getAsArrayBuffer();

    String getAsString();

    int getType();
}
