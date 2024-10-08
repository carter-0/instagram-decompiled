package X;

import android.animation.LayoutTransition;
import android.content.Context;
import android.transition.Scene;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.android.R;
import com.instagram.business.fragment.ProfileDisplayOptionsFragment;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.model.sharelater.ShareLaterMedia;
import java.util.Map;
import java.util.Set;

/* renamed from: X.LsC  reason: case insensitive filesystem */
public final class C65371LsC implements C358618bC {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C65371LsC(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    /* JADX WARNING: type inference failed for: r0v73, types: [X.EmJ, java.lang.Object] */
    public final boolean onToggle(boolean z) {
        String str;
        Integer num;
        Map map;
        ViewGroup viewGroup;
        Scene scene;
        TransitionSet transitionSet;
        int[] iArr;
        int i;
        String str2;
        boolean z2;
        JZY jzy;
        String str3;
        ShareLaterMedia shareLaterMedia;
        UserSession userSession;
        C48152EZu eZu;
        String str4;
        LM3 lm3;
        boolean z3 = z;
        switch (this.A00) {
            case 0:
                C60307Jj6 jj6 = (C60307Jj6) this.A03;
                LTO lto = jj6.A00;
                Integer num2 = AnonymousClass05K.A01;
                if (z) {
                    num = AnonymousClass05K.A0C;
                } else {
                    num = AnonymousClass05K.A0N;
                }
                C61039Jvd jvd = (C61039Jvd) this.A02;
                Boolean valueOf = Boolean.valueOf(jvd.A05);
                Boolean valueOf2 = Boolean.valueOf(jvd.A02);
                C61077JwF jwF = (C61077JwF) this.A01;
                Map map2 = null;
                if (jwF != null) {
                    map = (Map) jwF.A00;
                } else {
                    map = null;
                }
                Boolean valueOf3 = Boolean.valueOf(jvd.A03);
                Boolean valueOf4 = Boolean.valueOf(jvd.A04);
                lto.A08(valueOf, valueOf2, valueOf3, valueOf4, num2, num, map, (Map) null, 0Yt.A0E());
                if (z) {
                    if (jwF != null) {
                        map2 = (Map) jwF.A00;
                    }
                    lto.A09(valueOf, valueOf2, valueOf3, valueOf4, AnonymousClass05K.A0Y, map2);
                    AnonymousClass7TE.A1Z(new JV6((Object) jj6, (AnonymousClass4D7) null, 1, true), C318116oQ.A00(jj6));
                    return true;
                }
                AnonymousClass7TE.A1Z(new MHH(jwF, jj6, jvd, (AnonymousClass4D7) null, 8), C318116oQ.A00(jj6));
                return false;
            case 1:
                ProfileDisplayOptionsFragment.A02((ProfileDisplayOptionsFragment) this.A03, (IgdsSwitch) this.A02, (Integer) this.A01, z3);
                return true;
            case 2:
                C50626Ffh ffh = (C50626Ffh) this.A03;
                ViewGroup viewGroup2 = ffh.A07;
                if (viewGroup2 == null) {
                    str2 = "rootView";
                } else {
                    viewGroup2.setLayoutTransition((LayoutTransition) null);
                    String str5 = "viewSwitcher";
                    C49861FAb fAb = ffh.A0E;
                    if (z) {
                        if (fAb != null) {
                            Scene scene2 = fAb.A02;
                            String str6 = "postPicturePreviewScene";
                            if (scene2 != null) {
                                scene2.setEnterAction(fAb.A07);
                                str2 = "sceneRoot";
                                viewGroup = fAb.A05;
                                if (viewGroup != null) {
                                    scene = fAb.A02;
                                    if (scene != null) {
                                        transitionSet = fAb.A04;
                                        if (transitionSet == null) {
                                            str6 = "animatedTransition";
                                        } else {
                                            iArr = new int[2];
                                            iArr[0] = R.id.user_id;
                                            i = R.id.user_name;
                                            iArr[1] = i;
                                            C49861FAb.A00(scene, transitionSet, viewGroup, iArr);
                                            return true;
                                        }
                                    }
                                }
                            }
                            0qQ.A0F(str6);
                            throw AnonymousClass00P.createAndThrow();
                        }
                    } else if (fAb != null) {
                        Scene scene3 = fAb.A01;
                        str5 = "avatarBoxScene";
                        if (scene3 != null) {
                            scene3.setEnterAction(fAb.A06);
                            str2 = "sceneRoot";
                            viewGroup = fAb.A05;
                            if (viewGroup != null) {
                                scene = fAb.A01;
                                if (scene != null) {
                                    transitionSet = fAb.A04;
                                    if (transitionSet == null) {
                                        str5 = "animatedTransition";
                                    } else {
                                        iArr = new int[2];
                                        iArr[0] = R.id.header_container;
                                        i = R.id.footer_container;
                                        iArr[1] = i;
                                        C49861FAb.A00(scene, transitionSet, viewGroup, iArr);
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                    0qQ.A0F(str5);
                    throw AnonymousClass00P.createAndThrow();
                }
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            case 3:
                Object obj = this.A02;
                C48153EZv eZv = C48153EZv.A05;
                if (obj == eZv) {
                    C60058JeZ jeZ = (C60058JeZ) this.A03;
                    UserSession userSession2 = jeZ.A0J;
                    if (C363558jv.A00(userSession2) || ((shareLaterMedia = jeZ.A0K) != null && eZv.A0A(shareLaterMedia))) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 != z3 && jeZ.A0A) {
                        if (jeZ.A08) {
                            str3 = "tooltip_shown_only";
                        } else {
                            str3 = null;
                        }
                        C63424Kwk.A00(userSession2, "click", str3, z3);
                        if (!2Lv.A00(userSession2).A00(CallerContext.A00(C60058JeZ.class), "ig_android_linking_cache_feed_composer")) {
                            FFL.A00(C48152EZu.A0E, userSession2, "upsell_primary_click");
                        }
                        jeZ.A0A = false;
                    }
                    if (z) {
                        jzy = JZY.ONE_TIME_ON;
                    } else {
                        jzy = JZY.ONE_TIME_OFF;
                    }
                    C60058JeZ.A02(jzy, jeZ, z3);
                }
                ((View) this.A01).performClick();
                return false;
            case 4:
                C60058JeZ jeZ2 = (C60058JeZ) this.A03;
                if (!jeZ2.A0D || (lm3 = jeZ2.A03) == null) {
                    ((View) this.A01).performClick();
                    if (z) {
                        L6Z l6z = (L6Z) this.A02;
                        if (l6z.A01) {
                            userSession = jeZ2.A0J;
                            C64833Liv A002 = C63270KuF.A00(userSession);
                            String str7 = l6z.A00;
                            05G r1 = A002.A02;
                            r1.Epw(094.A01(str7, (Set) r1.getValue()));
                            eZu = C48152EZu.A0F;
                            str4 = "upsells_ig_ig_feed_cross_posting_toggle_turned_on";
                        } else {
                            C64833Liv A003 = C63270KuF.A00(jeZ2.A0J);
                            AnonymousClass4DH r4 = jeZ2.A0I;
                            String str8 = l6z.A00;
                            0qQ.A0B(r4, 0);
                            1Z9 A004 = C48920EmK.A00();
                            if (A004.A00 == null) {
                                A004.A00 = new Object();
                            }
                            new ELW().A01(r4, A003.A03, "ig_ig_feed_cross_posting", str8, 51738);
                            return false;
                        }
                    } else {
                        userSession = jeZ2.A0J;
                        C64833Liv A005 = C63270KuF.A00(userSession);
                        String str9 = ((L6Z) this.A02).A00;
                        05G r12 = A005.A02;
                        r12.Epw(094.A03(str9, (Set) r12.getValue()));
                        eZu = C48152EZu.A0F;
                        str4 = "upsells_ig_ig_feed_cross_posting_toggle_turned_off";
                    }
                    FFL.A00(eZu, userSession, str4);
                    return true;
                }
                C48153EZv eZv2 = C48153EZv.A05;
                LM3.A00(lm3, 2131961826, 2131961801);
                return false;
            case 5:
                UserSession userSession3 = (UserSession) this.A03;
                Context context = (Context) this.A01;
                C61499KAe kAe = new C61499KAe(18, context, this.A02);
                if (z) {
                    str = "everyone";
                } else {
                    str = "off";
                }
                1OC A012 = F7X.A01(userSession3, "live_broadcast", str);
                A012.A00 = kAe;
                1ES.A03(A012);
                AnonymousClass2MF.A00().A03(context, userSession3, "live_broadcast");
                return DbX.A1a(AnonymousClass2MF.A00().A01(context, userSession3, "live_broadcast"));
            default:
                return false;
        }
    }
}
