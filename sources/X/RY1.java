package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.react.modules.base.IgReactQEModule;

public abstract class RY1 {
    public static String A00(int i) {
        switch (i) {
            case 9:
                return "GRAPHQL_ANDROID_CURSOR_CURSOR_DB_PUT_MULTI";
            case 10:
                return "GRAPHQL_ANDROID_CURSOR_CURSOR_DB_DELETE_SESSION";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "GRAPHQL_ANDROID_CURSOR_CURSOR_DB_VISIT_REFLATTEN";
            case 13:
                return "GRAPHQL_ANDROID_CURSOR_CURSOR_DB_VISIT_DELTA_BUFFER";
            case 16:
                return "GRAPHQL_ANDROID_CURSOR_VISIT_ROW";
            case 17:
                return "GRAPHQL_ANDROID_CURSOR_APPLY_VISITORS";
            case 19:
                return "GRAPHQL_ANDROID_CURSOR_APPLY_VISITOR";
            case 21:
                return "GRAPHQL_ANDROID_CURSOR_TRIM_OLD_SESSIONS";
            case 22:
                return "GRAPHQL_ANDROID_CURSOR_TRIM_OLD_ROWS_FROM_SESSIONS";
            case 23:
                return "GRAPHQL_ANDROID_CURSOR_TRIM_UNUSED_MODEL_FILES";
            case 24:
                return "GRAPHQL_ANDROID_CURSOR_TRIM_TO_MINIMUM";
            case 25:
                return "GRAPHQL_ANDROID_CURSOR_QUERY_CHUNKS";
            case 26:
                return "GRAPHQL_ANDROID_CURSOR_QUERY_ROWS";
            case 28:
                return "GRAPHQL_ANDROID_CURSOR_TRIM_TO_NOTHING";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return "GRAPHQL_ANDROID_CURSOR_CURSOR_DB_PUT_MULTI_CONSISTENCY";
            case 31:
                return "GRAPHQL_ANDROID_CURSOR_QUERY";
            case 35:
                return "GRAPHQL_ANDROID_CURSOR_CONNECTION_CONTROLLER_INITIALIZE";
            case 36:
                return "GRAPHQL_ANDROID_CURSOR_CONNECTION_CONTROLLER_FETCH_EDGES";
            case 39:
                return "GRAPHQL_ANDROID_CURSOR_DESERIALIZE_MODEL";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
