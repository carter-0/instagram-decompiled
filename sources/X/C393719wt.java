package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.9wt  reason: invalid class name and case insensitive filesystem */
public abstract class C393719wt {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.A9V, java.lang.Object] */
    public static A9V parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("attitude_time_delay".equals(A17)) {
                    obj.A00 = r4.A0U();
                } else {
                    ArrayList arrayList = null;
                    if ("camera_device_type".equals(A17)) {
                        if (r4.A11() == 16L.A0G) {
                        }
                    } else if ("camera_distortion_1".equals(A17)) {
                        obj.A01 = r4.A0U();
                    } else if ("camera_distortion_2".equals(A17)) {
                        obj.A02 = r4.A0U();
                    } else if ("camera_focal_length".equals(A17)) {
                        obj.A03 = r4.A0U();
                    } else if ("camera_imu_from_camera_rotation".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r4.A1J() != 16L.A08) {
                                Double valueOf = Double.valueOf(r4.A0U());
                                if (valueOf != null) {
                                    arrayList.add(valueOf);
                                }
                            }
                        }
                        obj.A07 = arrayList;
                    } else if ("camera_imu_from_camera_translation".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r4.A1J() != 16L.A08) {
                                Double valueOf2 = Double.valueOf(r4.A0U());
                                if (valueOf2 != null) {
                                    arrayList.add(valueOf2);
                                }
                            }
                        }
                        obj.A08 = arrayList;
                    } else if ("camera_principal_point_x".equals(A17)) {
                        obj.A04 = r4.A0U();
                    } else if ("camera_principal_point_y".equals(A17)) {
                        obj.A05 = r4.A0U();
                    } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                        obj.A06 = r4.A0y();
                    } else if ("slam_capable".equals(A17)) {
                        obj.A09 = r4.A0d();
                    } else if ("slam_configuration_params".equals(A17)) {
                        if (r4.A11() == 16L.A0G) {
                        }
                    } else if ("vision_only_slam".equals(A17)) {
                        obj.A0A = r4.A0d();
                    }
                    r4.A1P();
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
