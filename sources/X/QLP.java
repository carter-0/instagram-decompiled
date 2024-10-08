package X;

import com.instagram.react.modules.base.IgReactQEModule;

public final class QLP extends RJQ {
    public final int A00;

    public final String A00() {
        switch (this.A00) {
            case 0:
                return "network_io_error";
            case 1:
                return "resource_not_found";
            case 2:
                return "http_response_error";
            case 3:
                return "api_error";
            case 4:
                return "illegal_resource_metadata";
            case 5:
                return "general_download_error";
            case 6:
                return "no_base_resource_for_delta";
            case 7:
                return "delta_patch_failed";
            case 8:
                return "unsupported_compression";
            case 9:
                return "uncompression_io_error";
            case 10:
                return "uncompressed_file_corrupted";
            case 11:
                return "checksum_io_error";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "cache_io_error";
            case 13:
                return "general_io_error";
            case 14:
                return "js_segment_hash_mismatch";
            default:
                return "unknown";
        }
    }

    public QLP(int i, String str) {
        super(str);
        this.A00 = i;
    }

    public final String toString() {
        String A0R;
        String localizedMessage = getLocalizedMessage();
        String A002 = A00();
        if (localizedMessage == null) {
            A0R = "";
        } else {
            A0R = 002.A0R(": ", localizedMessage);
        }
        return 002.A0u("ClientException(reason=", A002, ")", A0R);
    }

    public QLP(int i, Throwable th) {
        super(th);
        this.A00 = i;
    }

    public QLP(int i) {
        this.A00 = i;
    }

    public QLP() {
        this(15);
    }
}
