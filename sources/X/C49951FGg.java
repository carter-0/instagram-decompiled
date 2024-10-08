package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import androidx.fragment.app.FragmentActivity;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.aistudio.model.UtmMetadata;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentBackgroundModalActivity;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.FGg  reason: case insensitive filesystem */
public abstract class C49951FGg {
    public static final void A00(Activity activity, UtmMetadata utmMetadata, UserSession userSession, String str, String str2) {
        Class<ModalActivity> cls;
        String str3;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        String str4 = str;
        Bundle A0B = DbV.A0B(str, 2);
        A0B.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        A0B.putSerializable(AnonymousClass000.A00(607), str2);
        A0B.putParcelable(AnonymousClass000.A00(5364), utmMetadata);
        AnonymousClass9B9.A00();
        int intValue = AnonymousClass9BA.A00(userSession).A00().intValue();
        Activity activity2 = activity;
        if (intValue == 3) {
            if (182.A06(0Tu.A05, userSession, 36325145467433598L)) {
                cls = ModalActivity.class;
                str3 = "AI_HOME";
            } else if (!C331227Qb.A03(userSession)) {
                A01(activity2, userSession2, EV9.AI_HOME, str4, (String) null, false);
                return;
            } else {
                cls = ModalActivity.class;
                str3 = "agent_picker";
            }
            AnonymousClass6W8 A03 = AnonymousClass6W8.A03(activity, A0B, userSession, cls, str3);
            A03.A08();
            A03.A0C(activity);
        } else if (intValue == 1 || intValue == 2) {
            A0B.putBoolean("ai_agent_picker_is_modal", true);
            AnonymousClass6W8 A032 = AnonymousClass6W8.A03(activity, A0B, userSession, ModalActivity.class, "agent_picker");
            A032.A07();
            A032.A0A(activity, 105);
        }
    }

    public static final void A02(Context context, FragmentActivity fragmentActivity, AnonymousClass0iw r8, UserSession userSession, C69287Nin nin, DirectShareTarget directShareTarget) {
        AnonymousClass7TG.A1N(context, userSession);
        C48799EkN.A00(context, r8, userSession, new C58208IoC(36, fragmentActivity, userSession, nin, directShareTarget));
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.MVB] */
    public static final void A04(Context context, UserSession userSession, JO2 jo2) {
        Context context2 = context;
        UserSession userSession2 = userSession;
        boolean A1Z = AnonymousClass7TG.A1Z(context, userSession);
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession2, 36324831935082893L) && !182.A06(r3, userSession2, 36320438185632202L)) {
            C310336ap A0a = DbS.A0a();
            MovementMethod instance = LinkMovementMethod.getInstance();
            0qQ.A07(instance);
            A0a.A05 = instance;
            A0a.A0A(new Object());
            A0a.A01 = DbS.A04(r3, userSession2, 36606306911720822L);
            A0a.A0J = A1Z;
            A05(context2, userSession2, AnonymousClass05K.A00, (String) null, (String) null, new J6W(40, jo2, A0a, userSession2), R.attr.igds_color_icon_on_media, A1Z);
        }
    }

    /* JADX WARNING: type inference failed for: r21v1, types: [X.0rm, java.lang.Object] */
    public static final void A05(Context context, UserSession userSession, Integer num, String str, String str2, 0sP r21, int i, boolean z) {
        Context context2 = context;
        0qQ.A0B(context2, 0);
        UserSession userSession2 = userSession;
        0sP r1 = r21;
        if (!z || !C331227Qb.A03(userSession2)) {
            1vn A01 = 1vm.A01(userSession2);
            2IS A04 = C41845B3m.A04();
            2IS A042 = C41845B3m.A04();
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A05(), "GenAINuxConsentStatusQuery", A04.getParamsCopy(), A042.getParamsCopy(), C42698Bgv.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, AnonymousClass000.A00(1965), AnonymousClass7TE.A1C());
            ? obj = new Object();
            Integer num2 = num;
            String str3 = str;
            String str4 = str2;
            A01.ATL(new C50152FRk(context2, userSession2, num2, str3, str4, r1, obj, i, z), new FSK(context2, userSession2, num2, str3, str4, r1, obj, i, z), pandoGraphQLRequest);
            return;
        }
        1Av A00 = 1Au.A00(userSession2);
        0qQ.A0B("ai_agent_character_disclaimer_server_flag", 0);
        if (!A00.A01.getBoolean("ai_agent_character_disclaimer_server_flag", false)) {
            C48801EkP.A00(userSession2);
        }
        r1.invoke((Object) null);
    }

    public static final void A07(UserSession userSession, Activity activity, String str) {
        String str2 = str;
        0qQ.A0B(str, 2);
        UserSession userSession2 = userSession;
        if (C331227Qb.A03(userSession)) {
            1Av A00 = 1Au.A00(userSession);
            0qQ.A0B("ai_agent_character_disclaimer_server_flag", 0);
            if (!A00.A01.getBoolean("ai_agent_character_disclaimer_server_flag", false)) {
                C48801EkP.A00(userSession);
                return;
            }
            return;
        }
        A01(activity, userSession2, EV9.AI_THREAD, str2, (String) null, false);
    }

    public static final void A01(Activity activity, UserSession userSession, EV9 ev9, String str, String str2, boolean z) {
        AnonymousClass7TG.A1O(activity, str);
        if (AnonymousClass9B8.A07(userSession)) {
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putSerializable(C66579MXk.A00(1014), ev9);
            A0a.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            if (str2 != null) {
                A0a.putSerializable("ai_agent_id", str2);
            }
            AnonymousClass6W8 A03 = AnonymousClass6W8.A03(activity, A0a, userSession, ModalActivity.class, C273654mx.A00(1441));
            A03.A08();
            if (z) {
                A03.A0A(activity, 106);
            } else {
                A03.A0C(activity);
            }
        }
    }

    public static final void A03(Context context, UserSession userSession) {
        boolean A1Z = AnonymousClass7TG.A1Z(context, userSession);
        1Ln A0J = 1Ln.A0J(new AnonymousClass7I3(userSession).A01);
        if (DbT.A1Y(A0J)) {
            A0J.A0Z(34);
            A0J.A0X(A1Z ? 1 : 0);
            A0J.Cgf();
        }
        String A0d = AnonymousClass7TF.A0d(context.getResources(), 2131966292);
        SpannableStringBuilder A0C = DbS.A0C(AnonymousClass7TF.A0e(context.getResources(), A0d, 2131952605));
        AnonymousClass7AV.A04(A0C, new C48041ESg(context, userSession, DbV.A02(context), 4), A0d);
        1xC r4 = 1xC.A01;
        C310336ap A0a = DbS.A0a();
        A0a.A0D = A0C;
        MovementMethod instance = LinkMovementMethod.getInstance();
        0qQ.A07(instance);
        A0a.A05 = instance;
        A0a.A01 = DbS.A04(0Tu.A05, userSession, 36606306911720822L);
        A0a.A0J = A1Z;
        DbY.A1K(r4, A0a);
    }

    public static final void A06(UserSession userSession, Activity activity, String str) {
        AnonymousClass7TG.A1N(userSession, activity);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("bottom_sheet_content_fragment", AnonymousClass000.A00(2589));
        Bundle A0a2 = AnonymousClass7TE.A0a();
        A0a2.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        A0a.putBundle(AnonymousClass000.A00(610), A0a2);
        AnonymousClass6W8 A03 = AnonymousClass6W8.A03(activity, A0a, userSession, TransparentBackgroundModalActivity.class, "bottom_sheet");
        A03.A07();
        A03.A0C(activity);
    }
}
