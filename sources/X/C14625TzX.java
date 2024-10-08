package X;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.android.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.reels.question.model.QuestionResponsesModelIntf;
import com.instagram.user.model.User;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.TzX  reason: case insensitive filesystem */
public final class C14625TzX extends BaseAdapter implements AnonymousClass7Q7, CallerContextable {
    public static int A0H = 0;
    public static boolean A0I = false;
    public static final String __redex_internal_original_name = "ReelDashboardListAdapter";
    public int A00 = -1;
    public C250973mM A01;
    public 2bv A02;
    public C16138UpP A03;
    public boolean A04 = true;
    public final AnonymousClass4DH A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;
    public final ReelViewerConfig A08;
    public final AnonymousClass3BQ A09;
    public final C17834Vgn A0A;
    public final ReelDashboardFragment A0B;
    public final HashMap A0C = new HashMap();
    public final Map A0D = new HashMap();
    public final boolean A0E;
    public final boolean A0F;
    public final C355638Qt A0G = new C355638Qt(1);

    public static C14629Tzb A01(C14625TzX tzX, Object obj) {
        return (C14629Tzb) tzX.A0C.get(obj);
    }

    public static ArrayList A02(C14629Tzb tzb, C14625TzX tzX) {
        int A1a;
        int A1b;
        boolean z = tzX.A0F;
        LinearLayoutManager linearLayoutManager = null;
        ViewGroup CEd = tzb.A0h.CEd();
        if (z) {
            CEd = null;
            linearLayoutManager = (LinearLayoutManager) ((RecyclerView) CEd).A0D;
        }
        ArrayList arrayList = new ArrayList();
        if (linearLayoutManager == null) {
            if (CEd != null) {
                AdapterView adapterView = (AdapterView) CEd;
                A1a = adapterView.getFirstVisiblePosition();
                A1b = adapterView.getLastVisiblePosition();
            }
            return arrayList;
        }
        A1a = linearLayoutManager.A1a();
        A1b = linearLayoutManager.A1b();
        C255773uh r0 = tzb.A0G;
        r0.getClass();
        List A0c = r0.A0c();
        while (A1a < A1b) {
            if (A0c.size() > A1a) {
                arrayList.add(A0c.get(A1a));
            }
            A1a++;
        }
        return arrayList;
    }

    public static void A03(Context context, IgSimpleImageView igSimpleImageView, IgSimpleImageView igSimpleImageView2, IgTextView igTextView) {
        igTextView.setVisibility(8);
        JTP.A14(igSimpleImageView, Math.round((float) context.getResources().getDimensionPixelSize(R.dimen.achievements_only_you_top_margin)), Math.round((float) AnonymousClass7TF.A02(context, R.dimen.achievements_only_you_top_margin)));
        igSimpleImageView.setVisibility(0);
        igSimpleImageView2.setVisibility(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004a, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0055, code lost:
        if (X.AnonymousClass3S1.A04(r9.A0C.C12()) == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0057, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0058, code lost:
        if (r9 == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005a, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0065, code lost:
        if (X.AnonymousClass3S1.A04(r9.A0C.C1E()) == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0067, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        if (r9 == null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0075, code lost:
        if (X.AnonymousClass3S1.A04(r9.A0C.C0Z()) == false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0077, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0078, code lost:
        if (r9 == null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0085, code lost:
        if (X.AnonymousClass3S1.A04(r9.A0C.Bjr()) == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0087, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0088, code lost:
        if (r9 == null) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        r0 = r9.A0C.B4f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        if (r0 == null) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0092, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0097, code lost:
        if (r0.intValue() > 0) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0099, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009a, code lost:
        if (r14 != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009c, code lost:
        if (r13 != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009e, code lost:
        if (r12 != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a4, code lost:
        if (r4.A1H() != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a6, code lost:
        if (r8 != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a8, code lost:
        if (r11 != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00aa, code lost:
        if (r7 != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ac, code lost:
        if (r6 != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0035, code lost:
        if (r0.Bnk().isEmpty() != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ae, code lost:
        if (r3 != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b0, code lost:
        if (r2 != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b2, code lost:
        if (r1 != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b4, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b5, code lost:
        r7 = r17;
        r6 = r19;
        r8 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bc, code lost:
        if (r15 != false) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c0, code lost:
        if (A0I != false) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c6, code lost:
        if (A06(r8, r7, r4, r6) == false) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c8, code lost:
        r11 = r5.A0i;
        r10 = r21;
        r10.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d1, code lost:
        if (r11.A00 != null) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d3, code lost:
        r1 = r11.A04.inflate();
        r11.A00 = r1;
        r11.A01 = X.DbS.A0G(r1, com.instagram.android.R.id.reel_dashboard_call_to_action_icon);
        r11.A03 = X.AnonymousClass7TE.A0d(r1, com.instagram.android.R.id.reel_dashboard_call_to_action_title);
        r11.A02 = X.AnonymousClass7TE.A0d(r1, com.instagram.android.R.id.reel_dashboard_call_to_action_button);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f6, code lost:
        r11.A00.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fb, code lost:
        if (r9 == null) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fd, code lost:
        r12 = r11.A00.getContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0107, code lost:
        if (r7.A0i() == false) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0109, code lost:
        X.C17034VFi.A00(r11, X.DbW.A0h(r12, r7.A0r, 2131971473), r12.getString(2131971472), com.instagram.android.R.drawable.instagram_story_highlight_pano_outline_24);
        r2 = r11.A02;
        r2.getClass();
        r1 = new X.WBC(r10, 6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012a, code lost:
        X.AnonymousClass0fU.A00(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0131, code lost:
        if (A06(r8, r7, r4, r6) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0133, code lost:
        r4 = r5.A0g;
        r4.A03(0);
        r3 = r5.A0S;
        r2 = r3.getContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0142, code lost:
        if (r7.A0l() != false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0144, code lost:
        r0 = 2131971477;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0149, code lost:
        if (r6 != X.AnonymousClass3BQ.REEL_HIGHLIGHTS_UPDATES_HUB) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x014b, code lost:
        r0 = 2131971478;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x014e, code lost:
        ((android.widget.TextView) r4.A01()).setText(r2.getString(r0));
        X.0nA.A0X(r3, X.2Yu.A0G(r2, com.instagram.android.R.attr.actionBarHeight));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x016a, code lost:
        if (r9.A5i() == false) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x016c, code lost:
        X.C17034VFi.A00(r11, r12.getString(2131971475), r12.getString(2131973441), com.instagram.android.R.drawable.instagram_share_pano_outline_24);
        r2 = r11.A02;
        r2.getClass();
        r0 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0187, code lost:
        r1 = new X.WBD(r0, (java.lang.Object) r9, (java.lang.Object) r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x018d, code lost:
        X.C17034VFi.A00(r11, r12.getString(2131971471), r12.getString(2131971474), com.instagram.android.R.drawable.instagram_story_highlight_pano_outline_24);
        r2 = r11.A02;
        r2.getClass();
        r0 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a9, code lost:
        r2 = r5.A0j;
        r1 = r5.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01af, code lost:
        if (r2.A03 == r4) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b1, code lost:
        r2.A09 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b5, code lost:
        r2.A02 = r7;
        r2.A03 = r4;
        r2.A04 = r1;
        r2.A05 = r18;
        r2.A06 = r6;
        r2.A08 = X.AnonymousClass7TF.A0b();
        r0 = r2.A0W;
        r0.clear();
        r0.addAll(r10);
        r2.A07();
        r2 = r5.A0k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01db, code lost:
        if (r4.A0e.ordinal() == 1) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01dd, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01de, code lost:
        r2.A00 = r0;
        r0 = r5.A0h.CEd();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e7, code lost:
        r9.getClass();
        r0 = r9.A0C.CF1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0045, code lost:
        if (X.AnonymousClass3S1.A04(r9.A0C.C0r()) != false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f1, code lost:
        r0 = r5.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f3, code lost:
        if (r0 != null) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01f5, code lost:
        r0 = r5.A0Z.inflate();
        r5.A04 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01fd, code lost:
        r0.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0048, code lost:
        if (r9 != null) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(com.instagram.common.session.UserSession r16, com.instagram.model.reels.Reel r17, com.instagram.model.reels.ReelViewerConfig r18, X.AnonymousClass3BQ r19, X.C14629Tzb r20, instagram.features.stories.dashboard.fragment.ReelDashboardFragment r21) {
        /*
            r5 = r20
            X.3uh r4 = r5.A0G
            r4.getClass()
            java.util.List r0 = r4.A0c()
            boolean r0 = r0.isEmpty()
            r15 = 1
            r14 = r0 ^ 1
            java.util.List r10 = r4.A0l
            boolean r0 = X.AnonymousClass3S1.A04(r10)
            r13 = r0 ^ 1
            java.util.List r0 = r4.A0m
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            boolean r12 = X.AnonymousClass7TE.A1b(r0)
            X.1Xj r9 = r4.A0b
            com.instagram.reels.question.model.QuestionResponsesModelIntf r0 = X.C14627TzZ.A00(r4)
            if (r0 == 0) goto L_0x0037
            java.util.List r0 = r0.Bnk()
            boolean r0 = r0.isEmpty()
            r11 = 1
            if (r0 == 0) goto L_0x0038
        L_0x0037:
            r11 = 0
        L_0x0038:
            if (r9 == 0) goto L_0x0047
            X.1Xy r0 = r9.A0C
            java.util.List r0 = r0.C0r()
            boolean r0 = X.AnonymousClass3S1.A04(r0)
            r8 = 1
            if (r0 == 0) goto L_0x004a
        L_0x0047:
            r8 = 0
            if (r9 == 0) goto L_0x0057
        L_0x004a:
            X.1Xy r0 = r9.A0C
            java.util.List r0 = r0.C12()
            boolean r0 = X.AnonymousClass3S1.A04(r0)
            r7 = 1
            if (r0 == 0) goto L_0x005a
        L_0x0057:
            r7 = 0
            if (r9 == 0) goto L_0x0067
        L_0x005a:
            X.1Xy r0 = r9.A0C
            java.util.List r0 = r0.C1E()
            boolean r0 = X.AnonymousClass3S1.A04(r0)
            r6 = 1
            if (r0 == 0) goto L_0x006a
        L_0x0067:
            r6 = 0
            if (r9 == 0) goto L_0x0077
        L_0x006a:
            X.1Xy r0 = r9.A0C
            java.util.List r0 = r0.C0Z()
            boolean r0 = X.AnonymousClass3S1.A04(r0)
            r3 = 1
            if (r0 == 0) goto L_0x007a
        L_0x0077:
            r3 = 0
            if (r9 == 0) goto L_0x0087
        L_0x007a:
            X.1Xy r0 = r9.A0C
            java.util.List r0 = r0.Bjr()
            boolean r0 = X.AnonymousClass3S1.A04(r0)
            r2 = 1
            if (r0 == 0) goto L_0x008a
        L_0x0087:
            r2 = 0
            if (r9 == 0) goto L_0x0099
        L_0x008a:
            X.1Xy r0 = r9.A0C
            java.lang.Integer r0 = r0.B4f()
            if (r0 == 0) goto L_0x0099
            int r0 = r0.intValue()
            r1 = 1
            if (r0 > 0) goto L_0x009a
        L_0x0099:
            r1 = 0
        L_0x009a:
            if (r14 != 0) goto L_0x00b5
            if (r13 != 0) goto L_0x00b5
            if (r12 != 0) goto L_0x00b5
            boolean r0 = r4.A1H()
            if (r0 != 0) goto L_0x00b5
            if (r8 != 0) goto L_0x00b5
            if (r11 != 0) goto L_0x00b5
            if (r7 != 0) goto L_0x00b5
            if (r6 != 0) goto L_0x00b5
            if (r3 != 0) goto L_0x00b5
            if (r2 != 0) goto L_0x00b5
            if (r1 != 0) goto L_0x00b5
            r15 = 0
        L_0x00b5:
            r3 = 0
            r7 = r17
            r6 = r19
            r8 = r16
            if (r15 != 0) goto L_0x01a9
            boolean r0 = A0I
            if (r0 != 0) goto L_0x01a9
            boolean r0 = A06(r8, r7, r4, r6)
            if (r0 == 0) goto L_0x01f1
            X.VZf r11 = r5.A0i
            r10 = r21
            r10.getClass()
            android.view.View r0 = r11.A00
            if (r0 != 0) goto L_0x00f6
            android.view.ViewStub r0 = r11.A04
            android.view.View r1 = r0.inflate()
            r11.A00 = r1
            r0 = 2131439401(0x7f0b2f29, float:1.8500756E38)
            android.widget.ImageView r0 = X.DbS.A0G(r1, r0)
            r11.A01 = r0
            r0 = 2131439402(0x7f0b2f2a, float:1.8500758E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r1, r0)
            r11.A03 = r0
            r0 = 2131439400(0x7f0b2f28, float:1.8500754E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r1, r0)
            r11.A02 = r0
        L_0x00f6:
            android.view.View r0 = r11.A00
            r0.setVisibility(r3)
            if (r9 == 0) goto L_0x012d
            android.view.View r0 = r11.A00
            android.content.Context r12 = r0.getContext()
            boolean r0 = r7.A0i()
            if (r0 == 0) goto L_0x0166
            r2 = 2131238856(0x7f081fc8, float:1.8094003E38)
            r1 = 2131971473(0x7f134d91, float:1.9579926E38)
            java.lang.String r0 = r7.A0r
            java.lang.String r1 = X.DbW.A0h(r12, r0, r1)
            r0 = 2131971472(0x7f134d90, float:1.9579924E38)
            java.lang.String r0 = r12.getString(r0)
            X.C17034VFi.A00(r11, r1, r0, r2)
            android.widget.TextView r2 = r11.A02
            r2.getClass()
            r0 = 6
            X.WBC r1 = new X.WBC
            r1.<init>(r10, r0)
        L_0x012a:
            X.AnonymousClass0fU.A00(r1, r2)
        L_0x012d:
            boolean r0 = A06(r8, r7, r4, r6)
            if (r0 == 0) goto L_0x0165
            X.2eb r4 = r5.A0g
            r4.A03(r3)
            android.view.View r3 = r5.A0S
            android.content.Context r2 = r3.getContext()
            boolean r0 = r7.A0l()
            if (r0 != 0) goto L_0x014b
            X.3BQ r1 = X.AnonymousClass3BQ.REEL_HIGHLIGHTS_UPDATES_HUB
            r0 = 2131971477(0x7f134d95, float:1.9579934E38)
            if (r6 != r1) goto L_0x014e
        L_0x014b:
            r0 = 2131971478(0x7f134d96, float:1.9579936E38)
        L_0x014e:
            java.lang.String r1 = r2.getString(r0)
            android.view.View r0 = r4.A01()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r1)
            r0 = 2130968588(0x7f04000c, float:1.7545834E38)
            int r0 = X.2Yu.A0G(r2, r0)
            X.0nA.A0X(r3, r0)
        L_0x0165:
            return
        L_0x0166:
            boolean r0 = r9.A5i()
            if (r0 == 0) goto L_0x018d
            r2 = 2131238773(0x7f081f75, float:1.8093834E38)
            r0 = 2131971475(0x7f134d93, float:1.957993E38)
            java.lang.String r1 = r12.getString(r0)
            r0 = 2131973441(0x7f135541, float:1.9583918E38)
            java.lang.String r0 = r12.getString(r0)
            X.C17034VFi.A00(r11, r1, r0, r2)
            android.widget.TextView r2 = r11.A02
            r2.getClass()
            r0 = 9
        L_0x0187:
            X.WBD r1 = new X.WBD
            r1.<init>((int) r0, (java.lang.Object) r9, (java.lang.Object) r10)
            goto L_0x012a
        L_0x018d:
            r2 = 2131238856(0x7f081fc8, float:1.8094003E38)
            r0 = 2131971471(0x7f134d8f, float:1.9579922E38)
            java.lang.String r1 = r12.getString(r0)
            r0 = 2131971474(0x7f134d92, float:1.9579928E38)
            java.lang.String r0 = r12.getString(r0)
            X.C17034VFi.A00(r11, r1, r0, r2)
            android.widget.TextView r2 = r11.A02
            r2.getClass()
            r0 = 10
            goto L_0x0187
        L_0x01a9:
            X.TrF r2 = r5.A0j
            X.3mM r1 = r5.A0H
            X.3uh r0 = r2.A03
            if (r0 == r4) goto L_0x01b5
            java.lang.String r0 = ""
            r2.A09 = r0
        L_0x01b5:
            r2.A02 = r7
            r2.A03 = r4
            r2.A04 = r1
            r0 = r18
            r2.A05 = r0
            r2.A06 = r6
            java.lang.String r0 = X.AnonymousClass7TF.A0b()
            r2.A08 = r0
            java.util.List r0 = r2.A0W
            r0.clear()
            r0.addAll(r10)
            r2.A07()
            X.Dew r2 = r5.A0k
            X.3mL r0 = r4.A0e
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x01e7
            r0 = 0
        L_0x01de:
            r2.A00 = r0
            X.3Ar r0 = r5.A0h
            android.view.ViewGroup r0 = r0.CEd()
            goto L_0x01fd
        L_0x01e7:
            r9.getClass()
            X.1Xy r0 = r9.A0C
            java.lang.String r0 = r0.CF1()
            goto L_0x01de
        L_0x01f1:
            android.view.View r0 = r5.A04
            if (r0 != 0) goto L_0x01fd
            android.view.ViewStub r0 = r5.A0Z
            android.view.View r0 = r0.inflate()
            r5.A04 = r0
        L_0x01fd:
            r0.setVisibility(r3)
            goto L_0x012d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14625TzX.A04(com.instagram.common.session.UserSession, com.instagram.model.reels.Reel, com.instagram.model.reels.ReelViewerConfig, X.3BQ, X.Tzb, instagram.features.stories.dashboard.fragment.ReelDashboardFragment):void");
    }

    public static void A05(C14629Tzb tzb) {
        tzb.A0h.CEd().setVisibility(8);
        View view = tzb.A04;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = tzb.A09;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = tzb.A0A;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        View view4 = tzb.A03;
        if (view4 != null) {
            view4.setVisibility(8);
        }
        tzb.A0g.A03(8);
        0nA.A0X(tzb.A0S, 0);
        View view5 = tzb.A0i.A00;
        if (view5 != null) {
            view5.setVisibility(8);
        }
    }

    public final void A07() {
        Iterator A0t = AnonymousClass7TF.A0t(this.A0C);
        while (A0t.hasNext()) {
            ((C14629Tzb) A0t.next()).A0j.notifyDataSetChanged();
        }
    }

    public final void A08(int i, boolean z) {
        int size;
        1Xj r8;
        HashMap hashMap;
        int random;
        String str;
        String str2;
        Handler A0D2;
        Runnable wne;
        C250973mM r1 = this.A01;
        if (r1 == null) {
            size = 0;
        } else {
            size = C13989Tnp.A0v(this.A07, r1).size();
        }
        if (i < size) {
            C250973mM r0 = this.A01;
            r0.getClass();
            UserSession userSession = this.A07;
            C255773uh A0A2 = r0.A0A(userSession, i);
            if (A0A2 != null && A0A2.CWu() && (r8 = A0A2.A0b) != null) {
                int i2 = 1;
                if (AnonymousClass3YR.A06(userSession, r8, AnonymousClass05K.A0j, true)) {
                    HashMap hashMap2 = this.A0C;
                    String str3 = A0A2.A0j;
                    C14629Tzb tzb = (C14629Tzb) hashMap2.get(str3);
                    if (tzb != null && z) {
                        1Av r12 = this.A0A.A00;
                        if (r12.A1k()) {
                            r12.A1k();
                            AnonymousClass0iw r13 = this.A06;
                            AnonymousClass7TF.A1B(userSession, 1, r13);
                            AnonymousClass0kM r02 = new AnonymousClass0kM(userSession);
                            r02.A00 = r13;
                            C48734EjJ.A00(r02.A00(), AnonymousClass000.A00(1467), "stories");
                            0s1 A0C2 = DbW.A0C(this.A05);
                            if (r8.A4Z()) {
                                String str4 = str3.split("_")[0];
                                random = (int) (Math.random() * 2.147483647E9d);
                                hashMap = new HashMap();
                                hashMap.put("instance_id", Integer.toString(random));
                                hashMap.put("target_id", str4);
                                hashMap.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "story_swipe_up");
                                hashMap.put("origin", this.A09.A00);
                                if (182.A06(0Tu.A05, userSession, 36313969962584402L)) {
                                    str2 = AnonymousClass000.A00(1196);
                                } else {
                                    str2 = "com.instagram.insights.media.stories.surface";
                                }
                                02m.A0p.markerStart(39124993, random);
                                02m.A0p.markerAnnotate(39124993, random, "insights_type", "umi");
                                02m.A0p.markerAnnotate(39124993, random, "component_url", str2);
                                A0D2 = AnonymousClass7TF.A0D();
                                wne = new C20238Wnd(this, random);
                            } else {
                                i2 = 0;
                                String str5 = str3.split("_")[0];
                                hashMap = new HashMap();
                                random = (int) (Math.random() * 2.147483647E9d);
                                hashMap.put("instance_id", Integer.toString(random));
                                hashMap.put("target_id", str5);
                                hashMap.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "story_swipe_up");
                                hashMap.put("origin", this.A09.A00);
                                if (182.A06(0Tu.A05, userSession, 36313372962260901L)) {
                                    str = C273654mx.A00(72);
                                } else {
                                    str = "com.instagram.insights.media.stories.surface.core";
                                }
                                02m.A0p.markerStart(39124993, random);
                                02m.A0p.markerAnnotate(39124993, random, "insights_type", "umi");
                                02m.A0p.markerAnnotate(39124993, random, "component_url", str2);
                                A0D2 = AnonymousClass7TF.A0D();
                                wne = new C20239Wne(this, random);
                            }
                            A0D2.postDelayed(wne, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                            C46649DiU A042 = C46649DiU.A04(str2, hashMap);
                            IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) userSession);
                            igBloksScreenConfig.A03 = new C15404UcG(this, random, i2);
                            A0C2.A0D(C49891FBs.A02(igBloksScreenConfig, A042), (String) null, tzb.A0U.getId());
                            A0C2.A01();
                        }
                    }
                }
            }
        }
    }

    public final boolean AJe(String str) {
        C250973mM r1 = this.A01;
        r1.getClass();
        for (C255773uh A0c : C13989Tnp.A0v(this.A07, r1)) {
            Iterator it = A0c.A0c().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (DbT.A0k(it).getId().equals(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int getCount() {
        int size;
        C250973mM r2 = this.A01;
        if (r2 == null) {
            size = 0;
        } else {
            UserSession userSession = this.A07;
            0qQ.A0B(userSession, 0);
            size = C250973mM.A00(userSession, r2).size();
        }
        C250973mM r0 = this.A01;
        UserSession userSession2 = this.A07;
        int i = 0;
        if (r0 != null) {
            Reel reel = r0.A0H;
            if (!reel.A0i() && !C14610TzH.A01(userSession2, reel) && !reel.A0g()) {
                i = 1;
            }
        }
        return size + i;
    }

    public final int getItemViewType(int i) {
        int size;
        C250973mM r2 = this.A01;
        if (r2 == null) {
            size = 0;
        } else {
            UserSession userSession = this.A07;
            0qQ.A0B(userSession, 0);
            size = C250973mM.A00(userSession, r2).size();
        }
        if (i < size) {
            return 0;
        }
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0063, code lost:
        if (r2 == false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0415, code lost:
        if (r16 != false) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c1, code lost:
        if (r0 == r7) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01b3, code lost:
        if (X.182.A06(X.0Tu.A05, r8, 36317268497404883L) != false) goto L_0x01b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0470  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r29, android.view.View r30, android.view.ViewGroup r31) {
        /*
            r28 = this;
            r11 = r28
            r10 = r29
            r9 = r30
            int r0 = r11.getItemViewType(r10)
            r27 = r31
            if (r0 == 0) goto L_0x0039
            if (r30 != 0) goto L_0x0026
            android.view.LayoutInflater r2 = X.DbV.A0D(r27)
            r1 = 2131628758(0x7f0e12d6, float:1.8884818E38)
            r0 = r27
            android.view.View r9 = X.DbT.A0C(r2, r0, r1)
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r1 = r11.A0B
            r1.getClass()
            r0 = 7
            X.WBC.A00(r9, r0, r1)
        L_0x0026:
            r0 = 2131428426(0x7f0b044a, float:1.8478496E38)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = X.DbT.A0b(r9, r0)
            com.instagram.common.session.UserSession r0 = r11.A07
            com.instagram.common.typedurl.ImageUrl r1 = X.DbX.A0X(r0)
            X.0iw r0 = r11.A06
            r2.setUrl(r1, r0)
        L_0x0038:
            return r9
        L_0x0039:
            X.3mM r0 = r11.A01
            r0.getClass()
            com.instagram.common.session.UserSession r8 = r11.A07
            X.3uh r7 = r0.A0A(r8, r10)
            r6 = 1
            r5 = 0
            if (r30 != 0) goto L_0x0081
            android.view.LayoutInflater r2 = X.DbV.A0D(r27)
            r1 = 2131628778(0x7f0e12ea, float:1.8884858E38)
            r0 = r27
            android.view.View r9 = r2.inflate(r1, r0, r5)
            X.4DH r12 = r11.A05
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r4 = r11.A0B
            X.0iw r3 = r11.A06
            boolean r2 = r11.A0F
            boolean r0 = r11.A0E
            if (r0 == 0) goto L_0x0065
            r20 = 1
            if (r2 != 0) goto L_0x0067
        L_0x0065:
            r20 = 0
        L_0x0067:
            X.Tzb r1 = new X.Tzb
            r17 = r8
            r18 = r4
            r19 = r2
            r13 = r1
            r14 = r9
            r15 = r12
            r16 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r9.setTag(r1)
            X.Vgn r0 = r11.A0A
            java.util.List r0 = r0.A01
            r0.add(r1)
        L_0x0081:
            java.lang.Object r12 = X.DbT.A0o(r9)
            X.Tzb r12 = (X.C14629Tzb) r12
            X.2bv r3 = r11.A02
            r12.A0K = r3
            X.UpP r0 = r11.A03
            X.0iw r4 = r11.A06
            if (r0 == 0) goto L_0x00bb
            if (r3 == 0) goto L_0x00bb
            r12.A0L = r0
            com.instagram.common.ui.base.IgFrameLayout r0 = r12.A0D
            if (r0 != 0) goto L_0x00aa
            android.view.ViewStub r0 = r12.A0c
            android.view.View r1 = r0.inflate()
            com.instagram.common.ui.base.IgFrameLayout r1 = (com.instagram.common.ui.base.IgFrameLayout) r1
            r12.A0D = r1
            X.3ry r0 = new X.3ry
            r0.<init>(r1)
            r12.A0M = r0
        L_0x00aa:
            X.2sd r2 = new X.2sd
            r2.<init>(r4, r8)
            r12.A0N = r2
            X.3ry r1 = r12.A0M
            r1.getClass()
            X.UpP r0 = r12.A0L
            r2.ADo(r3, r0, r1)
        L_0x00bb:
            X.3uh r0 = r12.A0G
            if (r0 == 0) goto L_0x00c3
            r17 = 1
            if (r0 != r7) goto L_0x00c5
        L_0x00c3:
            r17 = 0
        L_0x00c5:
            X.3mM r0 = r11.A01
            r0.getClass()
            com.instagram.model.reels.Reel r0 = r0.A0H
            r12.A0F = r0
            r12.A0G = r7
            X.3mM r0 = r11.A01
            r12.A0H = r0
            X.3BQ r0 = r11.A09
            r26 = r0
            r12.A0J = r0
            com.instagram.model.reels.ReelViewerConfig r0 = r11.A08
            r25 = r0
            r12.A0I = r0
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r13 = r11.A0B
            r12.A0O = r13
            r0 = 11
            X.WBD r1 = new X.WBD
            r1.<init>((int) r0, (java.lang.Object) r7, (java.lang.Object) r11)
            android.view.View r4 = r12.A0T
            X.AnonymousClass0fU.A00(r1, r4)
            boolean r16 = r7.CWu()
            r3 = 8
            if (r16 == 0) goto L_0x05bb
            r4.setVisibility(r5)
            X.1Xj r14 = r7.A0b
            if (r14 == 0) goto L_0x05b4
            boolean r0 = X.C14610TzH.A03(r8, r7)
            if (r0 == 0) goto L_0x05b4
            android.view.View r0 = r12.A06
            if (r0 != 0) goto L_0x011f
            boolean r0 = A0I
            if (r0 != 0) goto L_0x011f
            android.view.ViewStub r0 = r12.A0b
            android.view.View r0 = r0.inflate()
            r12.A06 = r0
            r0.setVisibility(r5)
            android.view.View r2 = r12.A06
            r0 = 12
            X.WBD.A00(r2, r0, r14, r11)
        L_0x011f:
            int r15 = r7.A01()
            boolean r0 = r7.A0n()
            android.widget.TextView r2 = r12.A0f
            if (r0 == 0) goto L_0x0591
            r2.setCompoundDrawablePadding(r5)
        L_0x012e:
            java.util.HashMap r15 = r11.A0C
            java.lang.String r0 = r7.A0j
            boolean r14 = r15.containsKey(r0)
            if (r14 == 0) goto L_0x013e
            java.lang.Object r14 = r15.get(r0)
            if (r14 == r12) goto L_0x018b
        L_0x013e:
            java.lang.String r14 = r12.A0P
            r15.remove(r14)
            r12.A0P = r0
            r15.put(r0, r12)
            X.Dew r14 = r12.A0k
            r14.A02 = r5
            r14.A01 = r5
            boolean r14 = r7.A1Y()
            if (r14 == 0) goto L_0x0564
            X.4gK r15 = r7.A0d
            r15.getClass()
            java.util.Map r14 = r13.A0X
            java.lang.Object r0 = r14.get(r15)
            X.6Yy r0 = (X.C309616Yy) r0
            if (r0 == 0) goto L_0x0166
            r15.A01(r0)
        L_0x0166:
            X.WZ9 r0 = new X.WZ9
            r0.<init>(r13)
            r15.A00(r0)
            r14.put(r15, r0)
        L_0x0171:
            java.lang.String r15 = r7.A0P()
            boolean r0 = X.0mp.A0B(r15)
            if (r0 != 0) goto L_0x018b
            com.instagram.common.session.UserSession r14 = r13.A06
            X.P4C r0 = new X.P4C
            r0.<init>(r6, r7, r13)
            X.0qQ.A0B(r14, r5)
            X.0qQ.A0B(r15, r6)
            X.C69943Nuj.A00(r14, r0, r15)
        L_0x018b:
            A05(r12)
            r14 = 4
            if (r16 == 0) goto L_0x04a1
            int r0 = r7.A01()
            if (r0 != 0) goto L_0x01b5
            boolean r0 = r7.A0q()
            if (r0 != 0) goto L_0x01b5
            X.1Xj r0 = r7.A0b
            r0.getClass()
            boolean r0 = r0.A4X()
            if (r0 == 0) goto L_0x01b6
            X.0Tu r15 = X.0Tu.A05
            r0 = 36317268497404883(0x81065d000013d3, double:3.030525063436661E-306)
            boolean r0 = X.182.A06(r15, r8, r0)
            if (r0 == 0) goto L_0x01b6
        L_0x01b5:
            r14 = 0
        L_0x01b6:
            r2.setVisibility(r14)
            X.3mM r0 = r11.A01
            r0.getClass()
            com.instagram.model.reels.Reel r0 = r0.A0H
            r18 = r8
            r19 = r0
            r20 = r25
            r21 = r26
            r22 = r12
            r23 = r13
            A04(r18, r19, r20, r21, r22, r23)
            X.TrF r0 = r12.A0j
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0466
            if (r17 == 0) goto L_0x0466
            X.3Ar r0 = r12.A0h
            r0.Ejl(r5)
        L_0x01de:
            r13 = 0
            if (r16 == 0) goto L_0x040d
            X.1Xj r1 = r7.A0b
            if (r1 == 0) goto L_0x040d
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            boolean r0 = X.AnonymousClass3YR.A06(r8, r1, r0, r6)
            if (r0 == 0) goto L_0x040d
            r15 = 3
            X.WA1 r0 = new X.WA1
            r13 = r0
            r14 = r10
            r16 = r7
            r17 = r11
            r18 = r12
            r13.<init>(r14, r15, r16, r17, r18)
            X.AnonymousClass0fU.A00(r0, r2)
            android.widget.ImageView r0 = r12.A0B
            if (r0 != 0) goto L_0x0212
            android.view.ViewStub r0 = r12.A0Y
            android.view.View r1 = r0.inflate()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r12.A0B = r1
            r0 = 2131237833(0x7f081bc9, float:1.8091928E38)
            r1.setImageResource(r0)
        L_0x0212:
            android.widget.ImageView r0 = r12.A0B
            r0.setVisibility(r5)
            r0 = 12
            X.WB1 r13 = new X.WB1
            r13.<init>(r11, r10, r0)
            android.widget.ImageView r0 = r12.A0B
            X.AnonymousClass0fU.A00(r13, r0)
            boolean r0 = r11.A04
            if (r0 == 0) goto L_0x0230
            int r0 = r11.A00
            if (r10 != r0) goto L_0x0230
            r11.A08(r10, r6)
            r11.A04 = r5
        L_0x0230:
            X.Vgn r0 = r11.A0A
            X.1Av r0 = r0.A00
            boolean r0 = r0.A1k()
            r12.A00(r8, r0)
        L_0x023b:
            X.1Xj r15 = r7.A0b
            if (r15 == 0) goto L_0x0419
            boolean r0 = r15.A6I()
            if (r0 == 0) goto L_0x0419
            android.view.View r0 = r12.A01
            if (r0 != 0) goto L_0x0251
            android.view.ViewStub r0 = r12.A0W
            android.view.View r0 = r0.inflate()
            r12.A01 = r0
        L_0x0251:
            r0.setVisibility(r5)
            android.content.Context r19 = r27.getContext()
            android.view.View r1 = r12.A01
            r0 = 2131430333(0x7f0b0bbd, float:1.8482364E38)
            android.view.View r14 = r1.requireViewById(r0)
            com.instagram.common.ui.base.IgSimpleImageView r14 = (com.instagram.common.ui.base.IgSimpleImageView) r14
            android.view.View r1 = r12.A01
            r0 = 2131430335(0x7f0b0bbf, float:1.8482368E38)
            com.instagram.common.ui.base.IgTextView r10 = X.DbT.A0a(r1, r0)
            android.view.View r1 = r12.A01
            r0 = 2131430330(0x7f0b0bba, float:1.8482358E38)
            android.view.View r1 = r1.requireViewById(r0)
            com.instagram.common.ui.base.IgSimpleImageView r1 = (com.instagram.common.ui.base.IgSimpleImageView) r1
            X.1Xy r0 = r15.A0C
            java.util.List r18 = r0.AdL()
            if (r18 == 0) goto L_0x03fd
            boolean r0 = r18.isEmpty()
            if (r0 != 0) goto L_0x03fd
            X.1Xy r0 = r15.A0C
            X.DSP r0 = r0.C1N()
            if (r0 == 0) goto L_0x03f6
            java.util.List r0 = r0.AdE()
            java.util.Iterator r17 = r0.iterator()
        L_0x0295:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x03f6
            java.lang.Object r16 = r17.next()
            r0 = r16
            X.DTS r0 = (X.DTS) r0
            r16 = r0
            com.instagram.api.schemas.StoryTextAttributionType r15 = r16.AdA()
            com.instagram.api.schemas.StoryTextAttributionType r0 = com.instagram.api.schemas.StoryTextAttributionType.MULTIPLE_LISTS
            if (r15 != r0) goto L_0x0295
            java.lang.String r0 = r16.getText()
            r10.setText(r0)
            r10.setVisibility(r5)
            r14.setVisibility(r3)
            r1.setVisibility(r5)
            int r0 = r18.size()
            android.view.View r10 = r12.A01
            r1 = 36
            if (r0 != r6) goto L_0x02c9
            r1 = 35
        L_0x02c9:
            X.LY7 r6 = new X.LY7
            r0 = r18
            r6.<init>((int) r1, (java.lang.Object) r11, (java.lang.Object) r0)
        L_0x02d0:
            X.AnonymousClass0fU.A00(r6, r10)
        L_0x02d3:
            X.3QO r1 = r7.A0B()
            X.3QO r0 = X.AnonymousClass3QO.OPAL
            if (r1 != r0) goto L_0x03ef
            boolean r0 = X.C318996ps.A01()
            if (r0 == 0) goto L_0x03ef
            X.1q7 r0 = X.C318996ps.A00()
            boolean r0 = r0.A05(r8)
            if (r0 == 0) goto L_0x03ef
            android.view.View r0 = r12.A05
            if (r0 != 0) goto L_0x02f7
            android.view.ViewStub r0 = r12.A0a
            android.view.View r0 = r0.inflate()
            r12.A05 = r0
        L_0x02f7:
            r0.setVisibility(r5)
            android.view.View r1 = r12.A05
            r0 = 2131437287(0x7f0b26e7, float:1.8496468E38)
            android.widget.TextView r6 = X.DbU.A0G(r1, r0)
            X.1q7 r0 = X.C318996ps.A00()
            r0.A03()
            android.content.Context r1 = r27.getContext()
            X.0qQ.A0B(r1, r5)
            r0 = 2131968883(0x7f134373, float:1.9574673E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            r6.setText(r0)
            android.view.View r1 = r12.A05
            r0 = 2131437285(0x7f0b26e5, float:1.8496464E38)
            X.DbT.A1F(r1, r0, r3)
            android.view.View r3 = r12.A05
            r1 = 38
            X.LY7 r0 = new X.LY7
            r0.<init>((int) r1, (java.lang.Object) r11, (java.lang.Object) r7)
            X.AnonymousClass0fU.A00(r0, r3)
            X.1Xj r6 = r7.A0b
            if (r6 == 0) goto L_0x0350
            X.1q7 r0 = X.C318996ps.A00()
            X.F1V r3 = r0.A02()
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r6)
            if (r0 == 0) goto L_0x03eb
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r6)
            java.lang.String r1 = r0.getId()
        L_0x0349:
            java.lang.String r0 = r6.getId()
            r3.A00(r8, r1, r0)
        L_0x0350:
            X.3QO r1 = r7.A0B()
            X.3QO r0 = X.AnonymousClass3QO.HALLPASS
            if (r1 != r0) goto L_0x03e5
            X.1Xj r0 = r7.A0b
            if (r0 == 0) goto L_0x03a6
            X.1Xy r0 = r0.A0C
            X.82k r10 = r0.BAJ()
            if (r10 == 0) goto L_0x03a6
            android.view.View r0 = r12.A00
            if (r0 != 0) goto L_0x0370
            android.view.ViewStub r0 = r12.A0V
            android.view.View r0 = r0.inflate()
            r12.A00 = r0
        L_0x0370:
            r0.setVisibility(r5)
            android.view.View r1 = r12.A00
            r0 = 2131429508(0x7f0b0884, float:1.848069E38)
            android.widget.ImageView r6 = X.DbU.A0F(r1, r0)
            android.view.View r0 = r12.A00
            android.content.Context r3 = r0.getContext()
            X.0qQ.A0B(r3, r5)
            r1 = 2131238336(0x7f081dc0, float:1.8092948E38)
            int r0 = X.2Yu.A05(r3)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3JT.A06(r3, r1, r0)
            r6.setImageDrawable(r0)
            java.lang.String r8 = r10.BAL()
            java.lang.String r6 = r10.getName()
            android.view.View r3 = r12.A00
            r1 = 6
            X.LXW r0 = new X.LXW
            r0.<init>(r11, r6, r8, r1)
            X.AnonymousClass0fU.A00(r0, r3)
        L_0x03a6:
            boolean r0 = r7.A0g()
            if (r0 == 0) goto L_0x0038
            X.0nA.A0O(r4)
            android.view.View r0 = r12.A07
            X.0nA.A0O(r0)
            android.view.View r0 = r12.A08
            X.0nA.A0O(r0)
            android.view.View r0 = r12.A02
            X.0nA.A0O(r0)
            android.view.View r0 = r12.A01
            X.0nA.A0O(r0)
            android.view.View r0 = r12.A00
            X.0nA.A0O(r0)
            X.0nA.A0O(r2)
            android.view.View r0 = r12.A06
            X.0nA.A0O(r0)
            android.widget.ImageView r0 = r12.A0B
            X.0nA.A0O(r0)
            android.view.View r0 = r12.A05
            X.0nA.A0O(r0)
            android.widget.ImageView r0 = r12.A0B
            if (r0 == 0) goto L_0x0038
            r0.setVisibility(r5)
            X.AnonymousClass0fU.A00(r13, r0)
            return r9
        L_0x03e5:
            android.view.View r0 = r12.A00
            X.0nA.A0O(r0)
            goto L_0x03a6
        L_0x03eb:
            java.lang.String r1 = ""
            goto L_0x0349
        L_0x03ef:
            android.view.View r0 = r12.A05
            X.0nA.A0O(r0)
            goto L_0x0350
        L_0x03f6:
            r0 = r19
            A03(r0, r14, r1, r10)
            goto L_0x02d3
        L_0x03fd:
            r0 = r19
            A03(r0, r14, r1, r10)
            android.view.View r10 = r12.A01
            r0 = 34
            X.LXz r6 = new X.LXz
            r6.<init>(r11, r0)
            goto L_0x02d0
        L_0x040d:
            android.widget.ImageView r0 = r12.A0B
            X.0nA.A0O(r0)
            r2.setOnClickListener(r13)
            if (r16 == 0) goto L_0x0419
            goto L_0x023b
        L_0x0419:
            X.3QO r6 = r7.A0B()
            X.3QO r1 = X.AnonymousClass3QO.CLOSE_FRIENDS
            android.view.View r0 = r12.A01
            if (r6 != r1) goto L_0x0461
            if (r0 != 0) goto L_0x042d
            android.view.ViewStub r0 = r12.A0W
            android.view.View r0 = r0.inflate()
            r12.A01 = r0
        L_0x042d:
            r0.setVisibility(r5)
            android.view.View r1 = r12.A01
            r0 = 2131430335(0x7f0b0bbf, float:1.8482368E38)
            android.widget.TextView r6 = X.DbU.A0G(r1, r0)
            android.content.Context r1 = r27.getContext()
            r0 = 2131956170(0x7f1311ca, float:1.9548888E38)
            X.DbT.A18(r1, r6, r0)
            r6.setVisibility(r5)
            android.view.View r1 = r12.A01
            r0 = 2131430333(0x7f0b0bbd, float:1.8482364E38)
            X.DbT.A1F(r1, r0, r3)
            android.view.View r1 = r12.A01
            r0 = 2131430330(0x7f0b0bba, float:1.8482358E38)
            X.DbT.A1F(r1, r0, r5)
            android.view.View r10 = r12.A01
            r0 = 37
            X.LY7 r6 = new X.LY7
            r6.<init>((int) r0, (java.lang.Object) r11, (java.lang.Object) r7)
            goto L_0x02d0
        L_0x0461:
            X.0nA.A0O(r0)
            goto L_0x02d3
        L_0x0466:
            java.util.Map r1 = r11.A0D
            java.lang.String r0 = r12.A0P
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x01de
            boolean r14 = r11.A0F
            X.3Ar r0 = r12.A0h
            android.view.ViewGroup r13 = r0.CEd()
            if (r14 == 0) goto L_0x0493
            androidx.recyclerview.widget.RecyclerView r13 = (androidx.recyclerview.widget.RecyclerView) r13
            X.3pI r13 = r13.A0D
            r13.getClass()
            java.lang.String r0 = r12.A0P
            java.lang.Object r0 = r1.get(r0)
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r13.A1P(r0)
        L_0x048c:
            java.lang.String r0 = r12.A0P
            r1.remove(r0)
            goto L_0x01de
        L_0x0493:
            android.widget.AbsListView r13 = (android.widget.AbsListView) r13
            java.lang.String r0 = r12.A0P
            java.lang.Object r0 = r1.get(r0)
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r13.onRestoreInstanceState(r0)
            goto L_0x048c
        L_0x04a1:
            boolean r0 = r7.A1Y()
            if (r0 == 0) goto L_0x01de
            r2.setVisibility(r14)
            X.4gK r0 = r7.A0d
            r0.getClass()
            X.3Q2 r13 = r0.A00
            boolean r0 = r13.A0n()
            if (r0 == 0) goto L_0x04e2
            android.view.View r1 = r12.A0A
            if (r1 != 0) goto L_0x04c3
            android.view.ViewStub r0 = r12.A0e
            android.view.View r1 = r0.inflate()
            r12.A0A = r1
        L_0x04c3:
            com.instagram.feed.widget.IgProgressImageViewProgressBar r0 = r12.A0E
            if (r0 != 0) goto L_0x04d2
            r0 = 2131435634(0x7f0b2072, float:1.8493116E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.feed.widget.IgProgressImageViewProgressBar r0 = (com.instagram.feed.widget.IgProgressImageViewProgressBar) r0
            r12.A0E = r0
        L_0x04d2:
            android.view.View r0 = r12.A0A
            r0.setVisibility(r5)
            com.instagram.feed.widget.IgProgressImageViewProgressBar r1 = r12.A0E
            int r0 = r13.A03()
            r1.setProgress(r0)
            goto L_0x01de
        L_0x04e2:
            boolean r0 = r13.A0z()
            if (r0 == 0) goto L_0x053f
            android.view.View r1 = r12.A09
            if (r1 != 0) goto L_0x04f4
            android.view.ViewStub r0 = r12.A0d
            android.view.View r1 = r0.inflate()
            r12.A09 = r1
        L_0x04f4:
            android.view.View r0 = r12.A07
            if (r0 != 0) goto L_0x0501
            r0 = 2131439974(0x7f0b3166, float:1.8501918E38)
            android.view.View r0 = r1.requireViewById(r0)
            r12.A07 = r0
        L_0x0501:
            android.widget.TextView r0 = r12.A0C
            if (r0 != 0) goto L_0x0510
            android.view.View r1 = r12.A09
            r0 = 2131434704(0x7f0b1cd0, float:1.849123E38)
            android.widget.TextView r0 = X.DbU.A0G(r1, r0)
            r12.A0C = r0
        L_0x0510:
            android.view.View r0 = r12.A08
            if (r0 != 0) goto L_0x051f
            android.view.View r1 = r12.A09
            r0 = 2131439978(0x7f0b316a, float:1.8501926E38)
            android.view.View r0 = r1.requireViewById(r0)
            r12.A08 = r0
        L_0x051f:
            r0 = 9
            X.LY9 r1 = new X.LY9
            r1.<init>((int) r10, (int) r0, (java.lang.Object) r11, (java.lang.Object) r7)
            android.view.View r0 = r12.A09
            r0.setVisibility(r5)
            android.view.View r0 = r12.A07
            X.AnonymousClass0fU.A00(r1, r0)
            android.view.View r0 = r12.A08
            X.AnonymousClass0fU.A00(r1, r0)
            android.widget.TextView r1 = r12.A0C
            r0 = 2131976096(0x7f135fa0, float:1.9589303E38)
            r1.setText(r0)
            goto L_0x01de
        L_0x053f:
            android.view.View r13 = r12.A03
            if (r13 != 0) goto L_0x054b
            android.view.ViewStub r0 = r12.A0X
            android.view.View r13 = r0.inflate()
            r12.A03 = r13
        L_0x054b:
            android.view.View r0 = r12.A02
            if (r0 != 0) goto L_0x0558
            r0 = 2131431412(0x7f0b0ff4, float:1.8484552E38)
            android.view.View r0 = r13.requireViewById(r0)
            r12.A02 = r0
        L_0x0558:
            android.view.View r0 = r12.A03
            r0.setVisibility(r5)
            android.view.View r0 = r12.A02
            X.AnonymousClass0fU.A00(r1, r0)
            goto L_0x01de
        L_0x0564:
            java.util.Set r14 = r13.A0Y
            boolean r14 = r14.contains(r0)
            if (r14 != 0) goto L_0x0586
            r21 = 0
            boolean r23 = r7.A0q()
            X.Tzp r14 = new X.Tzp
            r14.<init>(r7, r13)
            r20 = r0
            r22 = r6
            r24 = r5
            r18 = r14
            r19 = r13
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment.A09(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0171
        L_0x0586:
            com.instagram.common.session.UserSession r14 = r13.A06
            X.W0E r14 = X.C14639Tzl.A00(r14)
            r14.A03(r0)
            goto L_0x0171
        L_0x0591:
            if (r15 != 0) goto L_0x059d
            r2.setCompoundDrawablePadding(r5)
            java.lang.String r0 = ""
        L_0x0598:
            r2.setText(r0)
            goto L_0x012e
        L_0x059d:
            int r0 = r12.A0R
            r2.setCompoundDrawablePadding(r0)
            java.lang.Integer r14 = new java.lang.Integer
            r14.<init>(r15)
            android.content.res.Resources r0 = r2.getResources()
            java.lang.String r0 = X.C253673rC.A02(r0, r14)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L_0x0598
        L_0x05b4:
            android.view.View r0 = r12.A06
            X.0nA.A0O(r0)
            goto L_0x011f
        L_0x05bb:
            boolean r0 = r7.A1Y()
            if (r0 == 0) goto L_0x011f
            android.view.View r0 = r12.A0U
            r0.setVisibility(r3)
            android.view.View r0 = r12.A06
            X.0nA.A0O(r0)
            X.4gK r0 = r7.A0d
            r0.getClass()
            X.3Q2 r0 = r0.A00
            boolean r0 = r0.A0n()
            if (r0 == 0) goto L_0x05dd
            r4.setVisibility(r3)
            goto L_0x011f
        L_0x05dd:
            r4.setVisibility(r5)
            goto L_0x011f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14625TzX.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public C14625TzX(AnonymousClass4DH r4, AnonymousClass0iw r5, UserSession userSession, ReelViewerConfig reelViewerConfig, AnonymousClass3BQ r8, C17834Vgn vgn, ReelDashboardFragment reelDashboardFragment) {
        this.A07 = userSession;
        this.A05 = r4;
        this.A0B = reelDashboardFragment;
        this.A06 = r5;
        this.A09 = r8;
        this.A08 = reelViewerConfig;
        this.A0A = vgn;
        0Tu r2 = 0Tu.A05;
        this.A0F = 182.A06(r2, userSession, 36311766644294407L);
        A0I = 182.A06(r2, userSession, 36316473928454542L);
        this.A0E = 182.A06(r2, userSession, 36324376668418099L);
    }

    public static RecyclerView A00(C14625TzX tzX, String str) {
        C14629Tzb A012 = A01(tzX, str);
        if (A012 != null) {
            C238133Ar r4 = A012.A0h;
            int B6L = r4.B6L();
            int BLQ = r4.BLQ();
            for (int i = B6L; i <= BLQ; i++) {
                if (A012.A0j.getItem(i) instanceof QuestionResponsesModelIntf) {
                    return (RecyclerView) r4.AnC(i - B6L);
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36317268497404883L) != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (r5.A1C() == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A06(com.instagram.common.session.UserSession r3, com.instagram.model.reels.Reel r4, X.C255773uh r5, X.AnonymousClass3BQ r6) {
        /*
            java.util.List r0 = r5.A0c()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0022
            X.1Xj r0 = r5.A0b
            r0.getClass()
            boolean r0 = r0.A4X()
            if (r0 == 0) goto L_0x0028
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317268497404883(0x81065d000013d3, double:3.030525063436661E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0028
        L_0x0022:
            boolean r0 = r5.A1C()
            if (r0 != 0) goto L_0x0033
        L_0x0028:
            boolean r0 = r4.A0l()
            if (r0 != 0) goto L_0x0033
            X.3BQ r1 = X.AnonymousClass3BQ.REEL_HIGHLIGHTS_UPDATES_HUB
            r0 = 0
            if (r6 != r1) goto L_0x0034
        L_0x0033:
            r0 = 1
        L_0x0034:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14625TzX.A06(com.instagram.common.session.UserSession, com.instagram.model.reels.Reel, X.3uh, X.3BQ):boolean");
    }

    public final void A09(String str, List<String> list) {
        C14629Tzb A012 = A01(this, str);
        if (A012 != null) {
            C255773uh r2 = A012.A0G;
            r2.getClass();
            if (r2.A0e == C250963mL.MEDIA) {
                if (list == null) {
                    list = Collections.emptyList();
                }
                1Xj r1 = r2.A0b;
                r1.getClass();
                0qQ.A0B(list, 0);
                1Xy r4 = r1.A0C;
                ArrayList A0r = AnonymousClass7TG.A0r(list);
                for (String parseLong : list) {
                    A0r.add(Long.valueOf(Long.parseLong(parseLong)));
                }
                r4.EkE(A0r);
            }
            A012.A0j.A07();
        }
    }

    public final void A0A(String str, boolean z) {
        C14629Tzb A012 = A01(this, str);
        if (A012 != null) {
            C46434Dew dew = A012.A0k;
            if (z != dew.isLoading()) {
                dew.A02 = z;
                A012.A0j.notifyDataSetChanged();
            }
        }
    }

    public final boolean A0B(String str, String str2, List list, List list2) {
        List list3;
        Set set;
        String str3;
        C14629Tzb A012 = A01(this, str);
        if (A012 == null) {
            return false;
        }
        C255773uh r1 = A012.A0G;
        r1.getClass();
        UserSession userSession = this.A07;
        if (r1.A0e.ordinal() == 1) {
            1Xj r6 = r1.A0b;
            r6.getClass();
            synchronized (r6) {
                0qQ.A0B(list, 0);
                1Xy r8 = r6.A0C;
                0sn CFJ = r8.CFJ();
                if (CFJ == null) {
                    CFJ = 0sn.A00;
                }
                ArrayList A0S = 00k.A0S(list, CFJ);
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                Iterator it = A0S.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    User user = (User) next;
                    if (user != null) {
                        str3 = user.getId();
                    } else {
                        str3 = null;
                    }
                    if (hashSet.add(str3)) {
                        arrayList.add(next);
                    }
                }
                r8.Eqg(arrayList);
                r6.A0C.Eqd(str2);
            }
        }
        C255773uh r82 = A012.A0G;
        r82.getClass();
        if (r82.A0N) {
            list3 = r82.A0n;
            set = r82.A0q;
        } else {
            list3 = r82.A0p;
            set = r82.A0r;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            AnonymousClass9J5 r2 = (AnonymousClass9J5) it2.next();
            if (r2.A07 && 182.A06(0Tu.A05, userSession, 36321387371046202L)) {
                r82.A0o.add(r2);
            } else if (set.add(((User) r2.A05).getId())) {
                list3.add(r2);
            }
        }
        A012.A0k.A00 = str2;
        if (182.A06(0Tu.A05, userSession, 36325592144032839L)) {
            W0E A002 = C14639Tzl.A00(userSession);
            ArrayList A022 = A02(A012, this);
            0qQ.A0B(str, 0);
            if (W0E.A00(A002, str) != null) {
                A002.A00 = A022;
                A002.A01 = true;
            }
        }
        A012.A0j.A07();
        return true;
    }

    public final void FK4() {
        0fE.A00(this, 1316261);
    }

    public final Object getItem(int i) {
        if (getItemViewType(i) != 0) {
            return null;
        }
        C250973mM r1 = this.A01;
        r1.getClass();
        return C13989Tnp.A0v(this.A07, r1).get(i);
    }

    public final long getItemId(int i) {
        if (getItemViewType(i) != 0) {
            return 0;
        }
        C355638Qt r2 = this.A0G;
        C250973mM r1 = this.A01;
        r1.getClass();
        return r2.A00(((C255773uh) C13989Tnp.A0v(this.A07, r1).get(i)).A0j);
    }
}
