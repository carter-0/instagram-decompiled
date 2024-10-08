package com.facebook.messenger.mcp.metadataprovider;

import X.SBG;
import java.util.Map;

public class McpHealthQPLMetadataProvider {
    public static native Map generateAnnotationMap(McpHealthQPLMetadataSnapshot mcpHealthQPLMetadataSnapshot, McpHealthQPLMetadataSnapshot mcpHealthQPLMetadataSnapshot2);

    public static native McpHealthQPLMetadataSnapshot snapshot(int i, int i2);

    static {
        SBG.A00();
    }
}
