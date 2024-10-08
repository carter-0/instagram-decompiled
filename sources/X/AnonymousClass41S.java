package X;

import java.io.IOException;

/* renamed from: X.41S  reason: invalid class name */
public abstract class AnonymousClass41S {
    public static AnonymousClass41T parseFromJson(16F r31) {
        16F r8 = r31;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Long l = null;
            Boolean bool = null;
            Long l2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Long l3 = null;
            Boolean bool2 = null;
            String str5 = null;
            String str6 = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("adID".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if ("packageName".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("deepLinkURI".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r8.A1P();
                    }
                } else if (!"postAppInstallCallback".equals(A0q)) {
                    if ("trackingToken".equals(A0q)) {
                        if (r8.A11() == 16L.A0G) {
                            str4 = null;
                        } else {
                            str4 = r8.A1P();
                        }
                    } else if ("trackingTime".equals(A0q)) {
                        l = Long.valueOf(r8.A0y());
                    } else if ("sponsoredTrackingToken".equals(A0q)) {
                        if (r8.A11() == 16L.A0G) {
                            str5 = null;
                        } else {
                            str5 = r8.A1P();
                        }
                    } else if ("isInstalled".equals(A0q)) {
                        bool = Boolean.valueOf(r8.A0d());
                    } else if ("installedTime".equals(A0q)) {
                        l2 = Long.valueOf(r8.A0y());
                    } else if ("openTime".equals(A0q)) {
                        l3 = Long.valueOf(r8.A0y());
                    } else if ("receivedOnForeground".equals(A0q)) {
                        bool2 = Boolean.valueOf(r8.A0d());
                    } else if ("storeInterface".equals(A0q)) {
                        if (r8.A11() == 16L.A0G) {
                            str6 = null;
                        } else {
                            str6 = r8.A1P();
                        }
                    }
                }
                r8.A0z();
            }
            if (str == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("adID", "AppInstallNotifier.TrackedInstall");
            } else if (str2 == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("packageName", "AppInstallNotifier.TrackedInstall");
            } else if (str4 == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("trackingToken", "AppInstallNotifier.TrackedInstall");
            } else if (l == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("trackingTime", "AppInstallNotifier.TrackedInstall");
            } else if (bool == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("isInstalled", "AppInstallNotifier.TrackedInstall");
            } else if (l2 == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("installedTime", "AppInstallNotifier.TrackedInstall");
            } else if (l3 == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("openTime", "AppInstallNotifier.TrackedInstall");
            } else if (bool2 != null || !(r8 instanceof 0c9)) {
                return new AnonymousClass41T((C13879Tj0) null, str, str2, str3, str4, str5, str6, l.longValue(), l2.longValue(), l3.longValue(), bool.booleanValue(), bool2.booleanValue());
            } else {
                ((0c9) r8).A03.A00("receivedOnForeground", "AppInstallNotifier.TrackedInstall");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
