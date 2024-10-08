package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.android.R;
import com.instagram.api.schemas.AvatarStatus;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.api.schemas.FanClubStatusSyncInfo;
import com.instagram.api.schemas.GrowthFrictionInfo;
import com.instagram.api.schemas.ProfilePicUrlInfo;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.sup.voltron.SUPMediaStreamControllerDownloader;
import com.instagram.user.model.FriendshipStatus;
import go.Seq;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9LL  reason: invalid class name */
public final class AnonymousClass9LL extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9LL(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C13997Tnz tnz;
        switch (this.A00) {
            case 0:
                return new C323506xb((UserSession) this.A01);
            case 1:
                return new 1Gd((UserSession) this.A01);
            case 2:
                C61620nx A002 = C61610nw.A00();
                A002.A01 = "pending_actions";
                AnonymousClass0vF r1 = new AnonymousClass0vF(A002);
                return new 0rJ(14i.A08, (UserSession) this.A01, r1);
            case 3:
                return new C17806VgJ((SUPMediaStreamControllerDownloader) ((1pd) this.A01).A04.getValue());
            case 4:
                return new AnonymousClass3eZ((UserSession) this.A01);
            case 5:
                return new C245943dj(new C20695WxR(this.A01, 47));
            case 6:
                return new C57240IUb(this.A01, 3);
            case 7:
                Interpolator interpolator = C338507i4.A07;
                Context context = ((C247753gr) this.A01).A01.getContext();
                C338507i4 r2 = new C338507i4(context);
                0qQ.A07(context);
                r2.A00(0nA.A00(context, 2.0f));
                r2.A05(context.getColor(R.color.igds_icon_on_color));
                r2.A02(Paint.Cap.ROUND);
                r2.stop();
                return r2;
            case 8:
                C70922Yp r22 = new C70922Yp((0lg) this.A01);
                C70922Yp.A01 = r22;
                return r22;
            case 9:
                View findViewById = ((C252063oV) ((AnonymousClass37F) this.A01).A11.getValue()).getView().findViewById(R.id.background_dimmer);
                findViewById.setAlpha(0.0f);
                2eS.A01(findViewById);
                return findViewById;
            case 10:
                AnonymousClass37F r23 = (AnonymousClass37F) this.A01;
                View findViewById2 = ((C252063oV) r23.A11.getValue()).getView().findViewById(r23.A0q);
                findViewById2.setVisibility(0);
                return findViewById2;
            case 11:
                View view = (View) this.A01;
                View findViewById3 = view.findViewById(R.id.bottom_sheet_container_stub);
                if (findViewById3 == null && (findViewById3 = view.findViewById(R.id.bottom_sheet_container)) == null) {
                    findViewById3 = view;
                }
                return 2b1.A00(findViewById3);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                Activity activity = (Activity) this.A01;
                if (!0lz.A02(activity)) {
                    return null;
                }
                View view2 = new View(activity);
                view2.setVisibility(0);
                view2.setBackgroundColor(activity.getColor(R.color.black_50_transparent));
                C226112fe.A0B.A05(activity, new C40896Al4(view2));
                ((ViewGroup) activity.requireViewById(16908290)).addView(view2);
                return view2;
            case 13:
                2Sa r12 = 2Sa.defaultInstance;
                C231502rm r0 = ((C232502tp) this.A01).A04;
                return 2Sa.A02(r12, (AnonymousClass3X7) null, (2Sd) null, -32775, r0.A0W, r0.A0S, r0.A0D);
            case 14:
                return new C7849QbX(new C39766A8g((C232502tp) this.A01));
            case 15:
                ((C255913uv) this.A01).setCurrentPage(0);
                return C60340gF.A00;
            case 16:
                UserSession userSession = (UserSession) this.A01;
                0qQ.A0B(userSession, 0);
                1y6 r3 = (1y6) userSession.A01(1y6.class, new MMF(userSession, 39));
                if (0oI.A09(C60960kU.A00)) {
                    tnz = new C13997Tnz(true, 3, false, false, false);
                } else {
                    0Tu r24 = 0Tu.A05;
                    tnz = new C13997Tnz(true, 3, 182.A06(r24, userSession, 36326262158931613L), 182.A06(r24, userSession, 36326262158997150L), 182.A06(r24, userSession, 36326262159062687L));
                }
                return new 1y3(tnz, 0wj.A01, userSession, r3);
            case 17:
                C320016rb r02 = (C320016rb) this.A01;
                UserSession userSession2 = r02.A02;
                AnonymousClass4DH r13 = r02.A01;
                return new C310306am(r13, userSession2, r13.getModuleName());
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return new C294705mt((UserSession) this.A01);
            case 19:
                C275854s3 r03 = (C275854s3) this.A01;
                if (r03 != null) {
                    return r03.FHC();
                }
                return null;
            case 20:
                C253353qe r04 = (C253353qe) this.A01;
                if (r04 != null) {
                    return r04.FHC();
                }
                return null;
            case 21:
                List<C46311DUo> list = (List) this.A01;
                if (list == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
                for (C46311DUo FHC : list) {
                    arrayList.add(FHC.FHC());
                }
                return arrayList;
            case 22:
                List<C46258DSn> list2 = (List) this.A01;
                if (list2 == null) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList(0Yv.A1E(list2, 10));
                for (C46258DSn FHC2 : list2) {
                    arrayList2.add(FHC2.FHC());
                }
                return arrayList2;
            case 23:
                AvatarStatus avatarStatus = (AvatarStatus) this.A01;
                if (avatarStatus != null) {
                    return avatarStatus.FHC();
                }
                return null;
            case 24:
                List<C253443qn> list3 = (List) this.A01;
                if (list3 == null) {
                    return null;
                }
                ArrayList arrayList3 = new ArrayList(0Yv.A1E(list3, 10));
                for (C253443qn FHC3 : list3) {
                    arrayList3.add(FHC3.FHC());
                }
                return arrayList3;
            case 25:
                C253503qt r05 = (C253503qt) this.A01;
                if (r05 != null) {
                    return r05.FHC();
                }
                return null;
            case 26:
                AnonymousClass48K r06 = (AnonymousClass48K) this.A01;
                if (r06 != null) {
                    return r06.FHC();
                }
                return null;
            case 27:
                AnonymousClass48H r07 = (AnonymousClass48H) this.A01;
                if (r07 != null) {
                    return r07.FHC();
                }
                return null;
            case 28:
                List<JSL> list4 = (List) this.A01;
                if (list4 == null) {
                    return null;
                }
                ArrayList arrayList4 = new ArrayList(0Yv.A1E(list4, 10));
                for (JSL FHC4 : list4) {
                    arrayList4.add(FHC4.FHC());
                }
                return arrayList4;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                AnonymousClass4I0 r08 = (AnonymousClass4I0) this.A01;
                if (r08 != null) {
                    return r08.FHC();
                }
                return null;
            case 30:
                C270004g2 r09 = (C270004g2) this.A01;
                if (r09 != null) {
                    return r09.FHC();
                }
                return null;
            case 31:
                AnonymousClass16x r010 = (AnonymousClass16x) this.A01;
                if (r010 != null) {
                    return r010.FHC();
                }
                return null;
            case 32:
                FanClubInfoDict fanClubInfoDict = (FanClubInfoDict) this.A01;
                if (fanClubInfoDict != null) {
                    return fanClubInfoDict.FHC();
                }
                return null;
            case 33:
                FanClubStatusSyncInfo fanClubStatusSyncInfo = (FanClubStatusSyncInfo) this.A01;
                if (fanClubStatusSyncInfo != null) {
                    return fanClubStatusSyncInfo.FHC();
                }
                return null;
            case 34:
                FriendshipStatus friendshipStatus = (FriendshipStatus) this.A01;
                if (friendshipStatus != null) {
                    return friendshipStatus.FHC();
                }
                return null;
            case 35:
                C278084wF r011 = (C278084wF) this.A01;
                if (r011 != null) {
                    return r011.FHC();
                }
                return null;
            case 36:
                GrowthFrictionInfo growthFrictionInfo = (GrowthFrictionInfo) this.A01;
                if (growthFrictionInfo != null) {
                    return growthFrictionInfo.FHC();
                }
                return null;
            case 37:
                ProfilePicUrlInfo profilePicUrlInfo = (ProfilePicUrlInfo) this.A01;
                if (profilePicUrlInfo != null) {
                    return profilePicUrlInfo.FHC();
                }
                return null;
            case 38:
                C275914s9 r012 = (C275914s9) this.A01;
                if (r012 != null) {
                    return r012.FHC();
                }
                return null;
            case 39:
                C253663rB r013 = (C253663rB) this.A01;
                if (r013 != null) {
                    return r013.FHC();
                }
                return null;
            case 40:
                AnonymousClass16l r014 = (AnonymousClass16l) this.A01;
                if (r014 != null) {
                    return r014.FHC();
                }
                return null;
            case Seq.NULL_REFNUM:
                C242043Sk r015 = (C242043Sk) this.A01;
                if (r015 != null) {
                    return r015.FHC();
                }
                return null;
            case Seq.RefTracker.REF_OFFSET:
                List<C253823rT> list5 = (List) this.A01;
                if (list5 == null) {
                    return null;
                }
                ArrayList arrayList5 = new ArrayList(0Yv.A1E(list5, 10));
                for (C253823rT FHC5 : list5) {
                    arrayList5.add(FHC5.FHC());
                }
                return arrayList5;
            case 43:
                C274674os r016 = (C274674os) this.A01;
                if (r016 != null) {
                    return r016.FHC();
                }
                return null;
            case 44:
                AnonymousClass16q r017 = (AnonymousClass16q) this.A01;
                if (r017 != null) {
                    return r017.FHC();
                }
                return null;
            case 45:
                C279994zp r018 = (C279994zp) this.A01;
                if (r018 != null) {
                    return r018.FHC();
                }
                return null;
            case 46:
                return new 17i((UserSession) this.A01);
            case 47:
                return 1Dm.A01.A00(((17i) this.A01).A00).A00().consistencyService;
            case 48:
                Object systemService = ((1Cn) this.A01).A08.getSystemService("power");
                if (systemService instanceof PowerManager) {
                    return systemService;
                }
                return null;
            default:
                return new 1DP((UserSession) this.A01);
        }
    }
}
