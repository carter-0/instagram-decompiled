package X;

import android.content.Context;
import android.os.Build;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.io.File;
import java.util.List;

public final class LFD {
    public final Context A00;
    public final UserSession A01;
    public final C2373837k A02;
    public final C66454MSi A03;

    public LFD(LP8 lp8) {
        0qQ.A0B(lp8, 1);
        this.A00 = lp8.A0B;
        this.A02 = lp8.A0E;
        this.A01 = lp8.A0C;
        this.A03 = lp8.A0G;
    }

    public final void A00(1Xj r18, AnonymousClass3Q2 r19, boolean z) {
        String str;
        String A002;
        AnonymousClass3Q2 r2 = r19;
        0qQ.A0B(r2, 0);
        String str2 = null;
        1Xj r3 = r18;
        if (r2.A12()) {
            String str3 = r2.A3V;
            if (str3 != null) {
                File parentFile = AnonymousClass7TE.A0t(str3).getParentFile();
                if (parentFile == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                } else if (!JTP.A1a(parentFile, AnonymousClass45D.A01)) {
                    String str4 = r2.A3V;
                    if (str4 != null) {
                        if (00p.A0i(str4, "mp4", false)) {
                            A002 = "video/mp4";
                        } else {
                            A002 = C66579MXk.A00(180);
                        }
                        C63395KwG.A00(this.A00, str4, A002);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
            }
            if (r2.A3V != null && r18 != null && !C59911Jba.A02(r2) && ((str = Build.MANUFACTURER) == null || (!str.equalsIgnoreCase("nokia")))) {
                r3.A0M = r2.A3V;
            }
            boolean A15 = r2.A15(ShareType.A02);
            boolean A003 = C59911Jba.A00(r2);
            UserSession userSession = this.A01;
            if (C63470KxZ.A00(userSession, A15, A003) && r2.A4w) {
                this.A03.EKF(this.A00, userSession, r2);
            }
            File CGg = AnonymousClass1F2.A00().CGg((1LJ) null, 1475200931);
            String str5 = r2.A1N.A0F;
            if (str5 != null) {
                File parentFile2 = AnonymousClass7TE.A0t(str5).getParentFile();
                if (parentFile2 != null) {
                    if (CGg.equals(parentFile2)) {
                        0mb.A08(str5);
                    }
                    List list = r2.A4a;
                    if (list != null && AnonymousClass7TE.A1b(list)) {
                        List<C282745Eo> list2 = r2.A4a;
                        if (list2 != null) {
                            for (C282745Eo r0 : list2) {
                                String str6 = r0.A05;
                                if (str6 != null) {
                                    0mb.A08(str6);
                                }
                            }
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    }
                    String str7 = r2.A3V;
                    if (z && str7 != null) {
                        File parentFile3 = AnonymousClass7TE.A0t(str7).getParentFile();
                        if (parentFile3 == null) {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        } else if (JTP.A1a(parentFile3, AnonymousClass45D.A01)) {
                            0mb.A08(str7);
                        }
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else if (r2.A1G == 1iA.A07) {
            C273744n7 r1 = r2.A1L;
            if (r1 != null) {
                str2 = r1.A01;
            }
            if (z && str2 != null) {
                0mb.A08(str2);
            }
        } else {
            boolean A152 = r2.A15(ShareType.A02);
            boolean A004 = C59911Jba.A00(r2);
            UserSession userSession2 = this.A01;
            if (C63470KxZ.A00(userSession2, A152, A004) && r2.A4w && !r2.A57) {
                Context context = this.A00;
                try {
                    File file = (File) new C13155TNn(context, userSession2, C59730JVo.A06(new C270184gK(r2), "ConfigureTool"), 0, 0, -1, true).call();
                    if (file != null && file.exists()) {
                        C59730JVo.A08(context, file);
                    }
                } catch (Exception e) {
                    0wb.A06("ConfigureTool#savePhotoToGallery", 002.A0R("id: ", r2.A3t), e);
                }
            }
            String str8 = r2.A33;
            if (str8 != null) {
                if (z || (!r2.A4t.isEmpty()) || r2.A5q) {
                    0mb.A08(str8);
                } else if (r18 == null) {
                    0wb.A03("ConfigureTool media is null", 002.A0R("id: ", r2.A3t));
                } else {
                    r3.A05 = JTQ.A09(str8);
                }
                if (!1Au.A00(userSession2).A1w()) {
                    JTO.A0s(AnonymousClass7TE.A0t(2RR.A01()), AnonymousClass000.A00(4091)).delete();
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public final void A01(AnonymousClass3Q2 r5) {
        C2373837k r1;
        String str;
        if (!r5.A12()) {
            1Av A002 = 1Au.A00(this.A01);
            if (!AnonymousClass7TG.A1a(A002, A002.A7B, 1Av.A8a, 34)) {
                r1 = this.A02;
                str = "Gallery render disabled";
            } else if (Build.VERSION.SDK_INT <= 29 && !1DL.A07(this.A00, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                r1 = this.A02;
                str = "Missing WRITE_EXTERNAL_STORAGE permission";
            } else {
                return;
            }
            r1.EG4(r5, str);
        }
    }
}
