package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GNi  reason: case insensitive filesystem */
public final class C52316GNi implements 0mK {
    public final /* synthetic */ GNH A00;

    public C52316GNi(GNH gnh) {
        this.A00 = gnh;
    }

    public final /* bridge */ /* synthetic */ void onDebouncedValue(Object obj) {
        28D r6;
        1Xj r0;
        List A3U;
        1Xj r15;
        1Xj r02;
        Bundle bundle;
        Integer num;
        GNH gnh = this.A00;
        C267324bN A0C = gnh.A0C();
        UserSession userSession = gnh.A0A;
        ClipsViewerSource clipsViewerSource = gnh.A08;
        switch (clipsViewerSource.ordinal()) {
            case 3:
                r6 = 28D.A1H;
                break;
            case 11:
            case 13:
                r6 = 28D.A0w;
                break;
            case 26:
                r6 = 28D.A2B;
                break;
            case 46:
                r6 = 28D.A1I;
                break;
            case 67:
                r6 = 28D.A1V;
                break;
            case 79:
                r6 = 28D.A1F;
                break;
            case 81:
                r6 = 28D.A1G;
                break;
            case 82:
                r6 = gnh.A07;
                break;
            case 129:
                r6 = 28D.A0t;
                break;
            case 136:
                r6 = 28D.A1K;
                break;
            default:
                r6 = 28D.A5J;
                break;
        }
        C56044Hrt A04 = I7J.A04(r6, A0C, userSession);
        Integer num2 = null;
        if (clipsViewerSource == ClipsViewerSource.AR_EFFECT) {
            if (A04 != null) {
                A04.A0G = null;
                A04.A08 = null;
                AnonymousClass8JL r4 = AnonymousClass8JL.NONE;
                0qQ.A0B(r4, 0);
                A04.A01 = r4;
                A04.A0H = gnh.A0G;
                A04.A0I = gnh.A0H;
            }
        } else if (clipsViewerSource == ClipsViewerSource.SONG || clipsViewerSource == ClipsViewerSource.MIFU_USE_AUDIO) {
            if (A04 != null) {
                A04.A0Q = null;
                A04.A0R = null;
                A04.A02 = null;
                AnonymousClass8JL r42 = AnonymousClass8JL.NONE;
                0qQ.A0B(r42, 0);
                A04.A01 = r42;
                A04.A0H = gnh.A0G;
                A04.A0I = gnh.A0H;
            }
        } else if (clipsViewerSource == ClipsViewerSource.HASHTAG) {
            String A0E = 002.A0E(gnh.A0F, '#', ' ');
            A04 = C250563lf.A0C(28D.A16);
            0qQ.A0B(A0E, 0);
            A04.A0b = A0E;
        } else if (clipsViewerSource == ClipsViewerSource.AUDIO_PAGE_IN_CREATION) {
            FragmentActivity fragmentActivity = gnh.A06;
            fragmentActivity.setResult(9689);
            fragmentActivity.finish();
            return;
        } else if (!(clipsViewerSource != ClipsViewerSource.TEXT_PAGE || A0C == null || (r0 = A0C.A02) == null || (A3U = r0.A3U()) == null)) {
            if (A04 == null) {
                A04 = C250563lf.A0C(r6);
            }
            A04.A0j = A3U;
        }
        if (clipsViewerSource != ClipsViewerSource.REMIX_REEL_NOTIFICATION_REMINDER || A0C == null || A0C.A02 == null) {
            if (A04 != null) {
                A04.A0m = true;
            }
            C227232is r7 = gnh.A04;
            if (r7 != null) {
                if (A04 != null) {
                    bundle = A04.A00();
                } else {
                    bundle = null;
                }
                0qQ.A0B(r6, 0);
                if (r7.getActivity() != null) {
                    I3M.A00(r7.requireActivity(), bundle, r7, r6, C227232is.A01(r7));
                }
            }
            if (A0C == null) {
                r15 = null;
            }
            r15 = A0C.A02;
        } else {
            C227232is r62 = gnh.A04;
            if (r62 != null) {
                28D A002 = C55275Hf4.A00(ClipsViewerSource.REMIX_REEL);
                0qQ.A0B(A002, 1);
                C52345GOp gOp = C52345GOp.A00;
                GBE gbe = r62.A09;
                String str = "clipsViewerFragmentViewModel";
                if (gbe != null) {
                    C51979GAc gAc = gbe.A19;
                    UserSession A01 = C227232is.A01(r62);
                    1Xj r11 = A0C.A02;
                    if (r11 != null) {
                        GD6 gd6 = r62.A0C;
                        if (gd6 == null) {
                            str = "viewerAdapter";
                        } else {
                            AnonymousClass3W1 r03 = JSx.A00(A0C, gd6).A0E;
                            if (r03 != null) {
                                num = C51968G9o.A0s(r03);
                            } else {
                                num = null;
                            }
                            GBE gbe2 = r62.A09;
                            if (gbe2 != null) {
                                String str2 = gbe2.A1E.A00;
                                FragmentActivity requireActivity = r62.requireActivity();
                                C227232is.A00(r62);
                                gOp.A0I(r62, requireActivity, A002, gAc, A01, r11, num, str2);
                            }
                        }
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            r15 = A0C.A02;
        }
        C52012GBj gBj = gnh.A02;
        if (gBj != null) {
            num2 = Integer.valueOf(gBj.A06());
        }
        if (r15 != null && num2 != null) {
            AnonymousClass0iw r5 = gnh.A09;
            0qQ.A0C(r5, C66579MXk.A00(2));
            AnonymousClass4DU r52 = (AnonymousClass4DU) r5;
            AnonymousClass93U r43 = gnh.A0B;
            String str3 = gnh.A0D.A00;
            int intValue = num2.intValue();
            if (A0C != null) {
                r02 = A0C.A02;
            } else {
                r02 = null;
            }
            C52086GEg.A0k(userSession, r15, r52, r43, str3, GN9.A00(r02), intValue);
        }
    }
}
