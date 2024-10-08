package X;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.media.SoundPool;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebookpay.offsite.base.CheckoutHandler;
import com.facebookpay.offsite.models.message.PaymentRequest;
import com.instagram.api.schemas.ClipsCameraCommandAction;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.api.schemas.MidCardLayoutType;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.user.model.User;
import com.meta.foa.accountswitcher.UserAccountInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.IoR  reason: case insensitive filesystem */
public final class C58223IoR extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58223IoR(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A05 = obj4;
        this.A02 = obj5;
        this.A06 = obj6;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        String obj;
        String str;
        List<GalleryItem> list;
        String str2;
        1Xj r1;
        User A11;
        MidCardLayoutType midCardLayoutType;
        switch (this.A00) {
            case 0:
                ((CheckoutHandler) this.A06).A0G((AnonymousClass2Fj) this.A03, (PaymentRequest) this.A02, (C11023S6a) this.A01, (Map) this.A04, (Map) this.A05);
                break;
            case 1:
                C284945Oz r3 = (C284945Oz) this.A04;
                C51967G9n.A15(r3, C51971G9r.A0B(r3) + 1);
                AnonymousClass61R r0 = (AnonymousClass61R) this.A02;
                if (r0 != null) {
                    r0.E2p();
                }
                Object obj2 = this.A03;
                AnonymousClass7TE.A1Z(new MHG(this.A05, r3, this.A06, obj2, (AnonymousClass4D7) null, 12), (C262224Cq) this.A01);
                break;
            case 2:
                C22035XuJ xuJ = (C22035XuJ) this.A01;
                if (xuJ != null) {
                    C60240fb.A00(xuJ, xuJ.A03);
                    xuJ.A00 = null;
                }
                SoundPool soundPool = (SoundPool) ((0rm) this.A03).A00;
                if (soundPool != null) {
                    soundPool.release();
                }
                UserSession userSession = ((GOK) this.A06).A04;
                if (182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36330836299236128L)) {
                    ((Animator) this.A02).cancel();
                    ((Animator) this.A04).cancel();
                    ((Animator) this.A05).cancel();
                    break;
                }
                break;
            case 3:
                return new C358338ak((Context) this.A03, (AnonymousClass0iw) this.A01, (UserSession) this.A06, (C357638Yz) this.A02, (AnonymousClass8BA) this.A04, (InteractiveDrawableContainer) this.A05);
            case 4:
                Context context = (Context) this.A01;
                AnonymousClass8BA r32 = (AnonymousClass8BA) this.A04;
                List list2 = (List) this.A03;
                AnonymousClass81W r4 = ((NineSixteenLayoutConfigImpl) ((TargetViewSizeProvider) this.A05)).A0K;
                UserSession userSession2 = (UserSession) this.A06;
                AnonymousClass7TG.A1U(context, r32, list2);
                0qQ.A0B(userSession2, 6);
                return new C353838Jj(context, userSession2, r32, r4, list2);
            case 5:
                C72505P8o.A01((C72505P8o) this.A06, (C254703su) this.A03, (AnonymousClass7S7) this.A05, (C254793t3) this.A04, (Integer) ((0rm) this.A02).A00, (String) ((0rm) this.A01).A00);
                break;
            case 6:
                UserSession userSession3 = ((C243273Yc) this.A06).A00;
                C238833Dp A002 = C238833Dp.A00(userSession3);
                A002.A0A((View) this.A04, new C246153e7((AnonymousClass4HI) null, userSession3, (1Xj) this.A02, (AnonymousClass4DU) this.A03));
                A002.A05((View) this.A01, C238863Ds.LIKE_LINK);
                A002.A05((View) this.A05, C238863Ds.SAVE_BUTTON);
                break;
            case 7:
                DbX.A1X(this.A02, (C262224Cq) this.A04, 42);
                FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                UserSession userSession4 = (UserSession) this.A05;
                AnonymousClass7TG.A1N(fragmentActivity, userSession4);
                C49126Epp.A00(fragmentActivity, (C15050ULg) this.A03, userSession4);
                break;
            case 8:
                try {
                    UserSession userSession5 = (UserSession) this.A06;
                    AnonymousClass0iw r2 = (AnonymousClass0iw) this.A01;
                    list = C63528Kyd.A00.A02((Resources) this.A05, r2, userSession5, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, (List) this.A04);
                } catch (C270384ge unused) {
                    Context context2 = (Context) this.A03;
                    0qQ.A0B(context2, 0);
                    C59689JTv.A01(context2, AnonymousClass000.A00(1381), 2131962946, 0);
                    List<GalleryItem> list3 = (List) this.A04;
                    ArrayList A0q = AnonymousClass7TF.A0q(list3, 0);
                    for (GalleryItem galleryItem : list3) {
                        Medium medium = galleryItem.A00;
                        if (medium != null) {
                            A0q.add(medium);
                        }
                    }
                    list = C64151LQo.A01(A0q);
                }
                JOZ joz = (JOZ) this.A02;
                ArrayList A0q2 = AnonymousClass7TF.A0q(list, 0);
                for (GalleryItem galleryItem2 : list) {
                    Medium medium2 = galleryItem2.A00;
                    if (medium2 != null) {
                        A0q2.add(medium2);
                    }
                }
                joz.DQB(A0q2);
                break;
            case 9:
                C268024cd r33 = (C268024cd) this.A04;
                C270284gU r22 = (C270284gU) this.A02;
                return new C56035Hri((AnonymousClass5b9) this.A01, r22, r33, (C54624HLh) this.A06, (Float) this.A05, (0sP) this.A03);
            case 10:
                CharSequence A003 = ((C52706GbJ) this.A06).A00();
                if (A003 == null || (obj = A003.toString()) == null || obj.length() == 0) {
                    ((2Wa) this.A05).A01(this.A04);
                } else {
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    for (Object next : (List) this.A03) {
                        UserAccountInfo userAccountInfo = (UserAccountInfo) next;
                        if (0qQ.A0K(userAccountInfo.A02, "FACEBOOK")) {
                            str = userAccountInfo.A05;
                        } else {
                            str = userAccountInfo.A0A;
                        }
                        if (str != null) {
                            Locale locale = Locale.ROOT;
                            if (00l.A0d(DbT.A12(locale, str), DbT.A12(locale, obj), false)) {
                                A1C.add(next);
                            }
                        }
                    }
                    Object obj3 = J54.A00;
                    if (AnonymousClass7TE.A1b(A1C)) {
                        obj3 = new J6T(36, (Object) A1C, this.A01);
                    }
                    ((2Wa) this.A05).A01(obj3);
                }
                ((C334997cD) this.A02).A00();
                break;
            default:
                ClipsCameraCommandAction clipsCameraCommandAction = (ClipsCameraCommandAction) this.A03;
                switch (clipsCameraCommandAction.ordinal()) {
                    case 1:
                        ((C52654GaS) this.A05).CIT((28D) this.A02);
                        break;
                    case 3:
                        ((C52654GaS) this.A05).CIQ((28D) this.A02);
                        break;
                    case 5:
                        C52654GaS gaS = (C52654GaS) this.A05;
                        UserSession userSession6 = gaS.A06;
                        if (!182.A06(0Tu.A05, userSession6, 36316662907015732L)) {
                            AnonymousClass9PQ.A08(gaS.A08, userSession6, "invalid_gallery_entry", "reels", (Map) null);
                        }
                        C62320sa r02 = gaS.A00;
                        if (r02 != null) {
                            r02.invoke();
                            break;
                        }
                        break;
                    case 7:
                        C52654GaS gaS2 = (C52654GaS) this.A05;
                        C53332GmI gmI = ((C52660GaY) this.A06).A00.A04;
                        Object obj4 = this.A02;
                        boolean A1U = AnonymousClass7TF.A1U(0, gmI, obj4);
                        InstagramMidcardType instagramMidcardType = gmI.A05;
                        if (instagramMidcardType != InstagramMidcardType.A0c) {
                            C51979GAc gAc = gaS2.A08;
                            String moduleName = gAc.getModuleName();
                            AnonymousClass93T r03 = gAc.A03;
                            String str3 = r03.A01;
                            String str4 = r03.A00;
                            0Aj A0M = C51972G9s.A0M(gAc, gaS2.A06);
                            int A022 = DbW.A02(A1U ? 1 : 0, moduleName, str3);
                            0qQ.A0B(str4, 3);
                            if (A0M.isSampled()) {
                                A0M.AAJ("organic_tap_action", "acr_midcard_button_tap");
                                C53452Gok gok = gmI.A06;
                                if (!(gok == null || (midCardLayoutType = gok.A07) == null)) {
                                    int ordinal = midCardLayoutType.ordinal();
                                    if (ordinal == A022) {
                                        str2 = "mega_card";
                                    } else if (ordinal == A1U) {
                                        str2 = "grid";
                                    } else if (ordinal == 3) {
                                        str2 = "single_clip";
                                    } else if (ordinal == 4) {
                                        str2 = "three_clips";
                                    }
                                    A0M.AAJ("organic_tap_action_source", str2);
                                    C51965G9l.A1M(A0M, moduleName);
                                    C51969G9p.A16(A0M, 0);
                                    C51965G9l.A1O(A0M, str3);
                                    Long l = null;
                                    C51965G9l.A1E(A0M, C51972G9s.A0j(gmI.A0C));
                                    List list4 = gmI.A0I;
                                    if (!(list4 == null || (r1 = (1Xj) 00k.A0J(list4)) == null || (A11 = C51966G9m.A11(r1)) == null)) {
                                        l = C51972G9s.A0h(A11);
                                    }
                                    C51965G9l.A1H(A0M, l);
                                    C51965G9l.A1R(A0M, str4);
                                    A0M.A8M(I3w.A01(instagramMidcardType), "midcard_type");
                                    A0M.A8M(I3w.A00(gmI.A04), "midcard_subtype");
                                    A0M.Cgf();
                                }
                                if (instagramMidcardType == InstagramMidcardType.A0e) {
                                    str2 = "clips_immersive_midcard";
                                } else {
                                    str2 = "clips_descriptive_midcard";
                                }
                                A0M.AAJ("organic_tap_action_source", str2);
                                C51965G9l.A1M(A0M, moduleName);
                                C51969G9p.A16(A0M, 0);
                                C51965G9l.A1O(A0M, str3);
                                Long l2 = null;
                                C51965G9l.A1E(A0M, C51972G9s.A0j(gmI.A0C));
                                List list42 = gmI.A0I;
                                l2 = C51972G9s.A0h(A11);
                                C51965G9l.A1H(A0M, l2);
                                C51965G9l.A1R(A0M, str4);
                                A0M.A8M(I3w.A01(instagramMidcardType), "midcard_type");
                                A0M.A8M(I3w.A00(gmI.A04), "midcard_subtype");
                                A0M.Cgf();
                            }
                        }
                        0sL r04 = gaS2.A03;
                        if (r04 != null) {
                            r04.invoke(gmI, obj4);
                            break;
                        }
                        break;
                    case 8:
                    case 9:
                        C2606046i r23 = (C2606046i) this.A01;
                        if (r23 != null) {
                            ((C52654GaS) this.A05).CIF((28D) this.A02, clipsCameraCommandAction, r23);
                            break;
                        }
                        break;
                    case 10:
                        1Xj r24 = (1Xj) this.A04;
                        if (r24 != null) {
                            ((C52654GaS) this.A05).CJL((28D) this.A02, r24);
                            break;
                        }
                        break;
                }
        }
        return C60340gF.A00;
    }
}
