package X;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8f8  reason: invalid class name and case insensitive filesystem */
public final class C360778f8 extends AnonymousClass3NK implements TextWatcher, C358978bm {
    public int A00;
    public int A01;
    public C387659mZ A02;
    public C349067zX A03;
    public int A04;
    public int A05;
    public boolean A06;
    public final Context A07;
    public final View A08;
    public final RecyclerView A09;
    public final UserSession A0A;
    public final TargetViewSizeProvider A0B;
    public final AnonymousClass8AL A0C;
    public final C358378ao A0D;
    public final ArrayList A0E;
    public final boolean A0F;
    public final EditText A0G;
    public final TextView A0H;

    public C360778f8(Context context, View view, EditText editText, RecyclerView recyclerView, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass8AL r16, C358378ao r17, C358868bb r18, boolean z, boolean z2) {
        List A092;
        int i;
        0qQ.A0B(context, 1);
        0qQ.A0B(editText, 2);
        0qQ.A0B(view, 3);
        0qQ.A0B(targetViewSizeProvider, 5);
        0qQ.A0B(userSession, 8);
        this.A09 = recyclerView;
        this.A0B = targetViewSizeProvider;
        if (z2) {
            A092 = 0sr.A1P(new C358868bb[]{C358878bc.A01("modern", false, false, false, false), C358878bc.A01(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, false, false, false, false), C358878bc.A01("strong_v2", false, false, false, false), C358878bc.A01("typewriter_v2", false, false, false, false), C358878bc.A01("meme", false, false, false, false), C358878bc.A01("directional", false, false, false, false)});
        } else {
            A092 = C358878bc.A09();
        }
        this.A0E = new ArrayList(A092);
        this.A0A = userSession;
        this.A0D = r17;
        this.A07 = context;
        C358868bb r0 = r18;
        if (r18 != null) {
            i = Math.max(A01(this, r0), 0);
        } else {
            i = 0;
        }
        A05(this, i, false);
        A05(this, A00(), true);
        this.A0G = editText;
        editText.addTextChangedListener(this);
        this.A08 = view;
        this.A0H = (TextView) view.findViewById(R.id.direct_camera_text_format_label);
        this.A0F = z;
        this.A0C = r16;
        AnonymousClass3NG r02 = new AnonymousClass3NG(view);
        r02.A04 = this;
        r02.A07 = true;
        r02.A0C = true;
        r02.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a4, code lost:
        if (r10 == 5) goto L_0x00a6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00c5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08() {
        /*
            r19 = this;
            r1 = 1
            r2 = r19
            X.8ao r3 = r2.A0D
            boolean r0 = r3.CQC()
            if (r0 == 0) goto L_0x00e6
            com.instagram.common.session.UserSession r5 = r2.A0A
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.0Tu r0 = X.0Tu.A05
            r3 = 36323139717704577(0x810bb400002b81, double:3.034238046795694E-306)
        L_0x0018:
            X.182.A06(r0, r5, r3)
        L_0x001b:
            com.instagram.common.session.UserSession r7 = r2.A0A
            r3 = 0
            X.0qQ.A0B(r7, r3)
            X.0Tu r0 = X.0Tu.A05
            r4 = 36331124061979556(0x8112f7000143a4, double:3.0392873782655644E-306)
            X.182.A06(r0, r7, r4)
            r6 = 0
            boolean r0 = r2.A06(r3)
            if (r0 == 0) goto L_0x0110
            X.7zX r5 = r2.A03
            if (r5 != 0) goto L_0x004b
            androidx.recyclerview.widget.RecyclerView r7 = r2.A09
            if (r7 == 0) goto L_0x01ac
            android.content.Context r4 = r2.A07
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r2.A0B
            X.7zX r5 = new X.7zX
            r8 = r5
            r9 = r4
            r10 = r7
            r11 = r0
            r12 = r2
            r13 = r3
            r8.<init>(r9, r10, r11, r12, r13)
            r2.A03 = r5
        L_0x004b:
            com.instagram.common.recyclerview.ViewModelListUpdate r4 = new com.instagram.common.recyclerview.ViewModelListUpdate
            r4.<init>()
            java.util.ArrayList r0 = A03(r2)
            int r0 = r0.size()
        L_0x0058:
            if (r3 >= r0) goto L_0x0196
            java.util.ArrayList r7 = A03(r2)
            java.lang.Object r9 = r7.get(r3)
            X.0qQ.A07(r9)
            X.8bb r9 = (X.C358868bb) r9
            android.content.Context r8 = r2.A07
            int r7 = r9.A02
            java.lang.String r16 = r8.getString(r7)
            X.0qQ.A07(r16)
            int r7 = r9.A00
            java.lang.String r17 = r8.getString(r7)
            r12 = 0
            X.8bh r9 = r9.A05
            X.0qq r7 = X.AnonymousClass0qo.A00(r8)
            android.graphics.Typeface r11 = X.AnonymousClass91U.A01(r7, r9)
            X.0qQ.A0B(r9, r6)
            int r7 = r9.ordinal()
            switch(r7) {
                case 4: goto L_0x00e3;
                case 6: goto L_0x00e0;
                case 7: goto L_0x00e3;
                case 9: goto L_0x00e3;
                case 24: goto L_0x00e0;
                case 26: goto L_0x00e0;
                default: goto L_0x008d;
            }
        L_0x008d:
            r7 = 16
        L_0x008f:
            float r7 = (float) r7
            java.lang.Float r13 = java.lang.Float.valueOf(r7)
            int r10 = r9.ordinal()
            r7 = 4
            if (r10 == r7) goto L_0x00a6
            r7 = 7
            if (r10 == r7) goto L_0x00dd
            r7 = 9
            if (r10 == r7) goto L_0x00d9
            r8 = 5
            r7 = 0
            if (r10 != r8) goto L_0x00a8
        L_0x00a6:
            r7 = 1056964608(0x3f000000, float:0.5)
        L_0x00a8:
            java.lang.Float r14 = java.lang.Float.valueOf(r7)
            int r8 = r9.ordinal()
            r7 = 6
            if (r8 == r7) goto L_0x00d6
            switch(r8) {
                case 5: goto L_0x00d0;
                case 8: goto L_0x00d6;
                case 9: goto L_0x00d6;
                case 11: goto L_0x00d3;
                case 22: goto L_0x00d0;
                case 25: goto L_0x00d0;
                default: goto L_0x00b6;
            }
        L_0x00b6:
            r7 = 0
        L_0x00b7:
            java.lang.Float r15 = java.lang.Float.valueOf(r7)
            int r7 = r2.A00()
            r18 = 0
            if (r3 != r7) goto L_0x00c5
            r18 = 1
        L_0x00c5:
            X.7zc r10 = new X.7zc
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r4.A00(r10)
            int r3 = r3 + 1
            goto L_0x0058
        L_0x00d0:
            r7 = -1090519040(0xffffffffbf000000, float:-0.5)
            goto L_0x00b7
        L_0x00d3:
            r7 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00b7
        L_0x00d6:
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x00b7
        L_0x00d9:
            r7 = -1119040307(0xffffffffbd4ccccd, float:-0.05)
            goto L_0x00a8
        L_0x00dd:
            r7 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00a8
        L_0x00e0:
            r7 = 19
            goto L_0x008f
        L_0x00e3:
            r7 = 18
            goto L_0x008f
        L_0x00e6:
            boolean r0 = r3.Ccc()
            if (r0 == 0) goto L_0x00fb
            com.instagram.common.session.UserSession r5 = r2.A0A
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.0Tu r0 = X.0Tu.A05
            r3 = 36323139718359947(0x810bb4000a2b8b, double:3.0342380472101525E-306)
            goto L_0x0018
        L_0x00fb:
            boolean r0 = r3.CTU()
            if (r0 == 0) goto L_0x001b
            com.instagram.common.session.UserSession r5 = r2.A0A
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.0Tu r0 = X.0Tu.A05
            r3 = 36323139719015317(0x810bb400142b95, double:3.034238047624611E-306)
            goto L_0x0018
        L_0x0110:
            X.9mZ r6 = r2.A02
            if (r6 != 0) goto L_0x0184
            android.content.Context r4 = r2.A07
            X.8AL r0 = r2.A0C
            if (r0 == 0) goto L_0x01bb
            X.9mZ r6 = new X.9mZ
            r6.<init>(r4, r7, r0, r2)
            r2.A02 = r6
            java.util.ArrayList r4 = r2.A02()
            r5 = 0
        L_0x0126:
            X.9mW r0 = r6.A01
            r0.A05(r4)
            int r0 = r4.size()
            if (r5 < r0) goto L_0x0132
            r5 = 0
        L_0x0132:
            X.8AL r0 = r6.A01
            X.As6 r4 = new X.As6
            r4.<init>(r6, r5)
            com.instagram.creation.capture.quickcapture.faceeffectui.NestableSnapPickerRecyclerView r0 = r0.A0P
            X.0nA.A0t(r0, r4)
            X.9mZ r8 = r2.A02
            if (r8 == 0) goto L_0x01ba
            X.8AL r0 = r8.A01
            boolean r0 = r0.A0C
            if (r0 != 0) goto L_0x01ba
            r8.A01(r1)
            X.8bb r7 = r2.A07()
            X.0qQ.A0B(r7, r3)
            X.9mW r6 = r8.A01
            java.util.List r5 = r6.A02
            java.util.List r0 = java.util.Collections.unmodifiableList(r5)
            int r4 = r0.size()
            r2 = 0
        L_0x015f:
            r1 = -1
            if (r2 >= r4) goto L_0x018d
            java.util.List r0 = java.util.Collections.unmodifiableList(r5)
            java.lang.Object r0 = r0.get(r2)
            X.0qQ.A0A(r0)
            X.AXJ r0 = (X.AXJ) r0
            X.8bb r0 = r0.A00
            if (r0 != r7) goto L_0x0181
            if (r2 == r1) goto L_0x018d
            r6.A03(r2)
            X.ApK r0 = new X.ApK
            r0.<init>(r8, r2, r3)
            X.11Z.A03(r0)
            return
        L_0x0181:
            int r2 = r2 + 1
            goto L_0x015f
        L_0x0184:
            java.util.ArrayList r4 = r2.A02()
            int r5 = r2.A00()
            goto L_0x0126
        L_0x018d:
            java.lang.String r2 = "TextFormatSnapPickerController"
            java.lang.String r1 = "Tried to scroll to mode that doesn't exist"
            r0 = 0
            X.0kD.A07(r2, r1, r0)
            return
        L_0x0196:
            int r3 = r2.A00()
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x01ac
            X.2t9 r0 = r5.A08
            r0.A05(r4)
            r0.notifyDataSetChanged()
            X.C349067zX.A01(r5, r3, r1, r6)
            X.C349067zX.A00(r5)
        L_0x01ac:
            X.7zX r0 = r2.A03
            if (r0 == 0) goto L_0x01ba
            androidx.recyclerview.widget.RecyclerView r0 = r0.A07
            android.view.View[] r2 = new android.view.View[]{r0}
            r0 = 0
            X.C294975nL.A04(r0, r2, r1)
        L_0x01ba:
            return
        L_0x01bb:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C360778f8.A08():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09() {
        /*
            r9 = this;
            r0 = 1
            r9.A06 = r0
            X.8bb r0 = r9.A07()
            X.8f1 r2 = r0.A04
            r4 = 0
            if (r2 == 0) goto L_0x0085
            android.widget.EditText r1 = r9.A0G
            android.text.Editable r0 = r1.getText()
            X.0qQ.A07(r0)
            boolean r0 = X.C358948bj.A06(r0)
            if (r0 != 0) goto L_0x0085
            android.text.Editable r0 = r1.getText()
            X.0qQ.A07(r0)
            boolean r0 = X.C358948bj.A05(r0)
            if (r0 == 0) goto L_0x0085
            boolean r0 = r2 instanceof X.C360848fF
            if (r0 == 0) goto L_0x0085
            r0 = 1
        L_0x002d:
            com.instagram.common.session.UserSession r8 = r9.A0A
            X.8bb r7 = r9.A07()
            android.widget.EditText r6 = r9.A0G
            X.0qQ.A0B(r8, r4)
            r1 = 1
            X.0qQ.A0B(r7, r1)
            r1 = 2
            X.0qQ.A0B(r6, r1)
            android.content.Context r5 = r6.getContext()
            X.0qQ.A07(r5)
            android.text.Editable r3 = r6.getText()
            X.0qQ.A07(r3)
            android.text.TextPaint r2 = r6.getPaint()
            X.0qQ.A07(r2)
            r1 = 0
            X.AnonymousClass91S.A01(r3, r7, r0)
            X.AnonymousClass91U.A02(r5, r3, r7)
            X.AnonymousClass91W.A01(r5, r2, r3, r7)
            X.AnonymousClass91Y.A00(r6, r7, r1)
            X.AnonymousClass91Z.A00(r3, r7)
            android.widget.TextView r3 = r9.A0H
            if (r3 == 0) goto L_0x007f
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323139719343002(0x810bb400192b9a, double:3.0342380478318404E-306)
            boolean r1 = X.182.A06(r2, r8, r0)
            X.8bb r0 = r9.A07()
            if (r1 == 0) goto L_0x0082
            int r0 = r0.A02
        L_0x007c:
            r3.setText(r0)
        L_0x007f:
            r9.A06 = r4
            return
        L_0x0082:
            int r0 = r0.A01
            goto L_0x007c
        L_0x0085:
            r0 = 0
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C360778f8.A09():void");
    }

    public final void A0A(boolean z) {
        if (A06(true)) {
            C349067zX r0 = this.A03;
            if (r0 == null) {
                RecyclerView recyclerView = this.A09;
                if (recyclerView != null) {
                    r0 = new C349067zX(this.A07, recyclerView, this.A0B, this, false);
                    this.A03 = r0;
                } else {
                    return;
                }
            }
            C294975nL.A05(new View[]{r0.A07}, z);
            return;
        }
        C387659mZ r3 = this.A02;
        if (r3 == null) {
            Context context = this.A07;
            AnonymousClass8AL r1 = this.A0C;
            if (r1 != null) {
                r3 = new C387659mZ(context, this.A0A, r1, this);
                this.A02 = r3;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        r3.CL9(z);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final int A00() {
        if (this.A0D.CQC()) {
            return this.A05;
        }
        return this.A04;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        if (X.182.A06(X.0Tu.A06, r3, 36323139719015317L) != false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0109, code lost:
        if (r16 != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if (X.182.A06(X.0Tu.A06, r3, 36323139718359947L) == false) goto L_0x002b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008f A[LOOP:0: B:20:0x0089->B:22:0x008f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A01(X.C360778f8 r18, X.C358868bb r19) {
        /*
            r13 = r18
            X.8ao r4 = r13.A0D
            boolean r0 = r4.CQC()
            if (r0 == 0) goto L_0x0012
            com.instagram.common.session.UserSession r0 = r13.A0A
            boolean r0 = X.AnonymousClass8IK.A08(r0)
            if (r0 != 0) goto L_0x0044
        L_0x0012:
            boolean r0 = r4.Ccc()
            if (r0 == 0) goto L_0x002b
            com.instagram.common.session.UserSession r3 = r13.A0A
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.0Tu r2 = X.0Tu.A06
            r0 = 36323139718359947(0x810bb4000a2b8b, double:3.0342380472101525E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0044
        L_0x002b:
            boolean r0 = r4.CTU()
            if (r0 == 0) goto L_0x010d
            com.instagram.common.session.UserSession r3 = r13.A0A
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.0Tu r2 = X.0Tu.A06
            r0 = 36323139719015317(0x810bb400142b95, double:3.034238047624611E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x010d
        L_0x0044:
            r16 = 1
        L_0x0046:
            java.lang.String r15 = "neon_v2"
            java.lang.String r18 = "dynapuff"
            java.lang.String r17 = "mono"
            java.lang.String r14 = "classic_v2"
            java.lang.String r12 = "alumni_sans"
            java.lang.String r11 = "poppins"
            java.lang.String r10 = "caprasimo"
            java.lang.String r9 = "literature"
            java.lang.String r8 = "ig_deco"
            java.lang.String r7 = "ig_poster"
            java.lang.String r6 = "ig_signature"
            java.lang.String r5 = "ig_squeeze"
            java.lang.String r4 = "ig_editor"
            java.lang.String r3 = "ig_bubble"
            java.lang.String r2 = "ig_literature"
            java.lang.String r0 = "ig_classic"
            r1 = r19
            java.lang.String r1 = r1.A09
            if (r16 == 0) goto L_0x00c9
            if (r1 == 0) goto L_0x0075
            int r16 = r1.hashCode()
            switch(r16) {
                case -1744775855: goto L_0x0104;
                case -1617422471: goto L_0x00c3;
                case -394091697: goto L_0x00bd;
                case -346746060: goto L_0x00b7;
                case -281568951: goto L_0x00b1;
                case 3357411: goto L_0x00a9;
                case 1443377805: goto L_0x00a1;
                case 1838584197: goto L_0x009b;
                default: goto L_0x0075;
            }
        L_0x0075:
            r15 = r1
        L_0x0076:
            java.util.ArrayList r1 = A03(r13)
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0089:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0111
            java.lang.Object r0 = r1.next()
            X.8bb r0 = (X.C358868bb) r0
            java.lang.String r0 = r0.A09
            r2.add(r0)
            goto L_0x0089
        L_0x009b:
            boolean r16 = r1.equals(r15)
            r15 = r6
            goto L_0x0109
        L_0x00a1:
            r0 = r18
            boolean r16 = r1.equals(r0)
            r15 = r3
            goto L_0x0109
        L_0x00a9:
            r0 = r17
            boolean r16 = r1.equals(r0)
            r15 = r4
            goto L_0x0109
        L_0x00b1:
            boolean r16 = r1.equals(r14)
            r15 = r0
            goto L_0x0109
        L_0x00b7:
            boolean r16 = r1.equals(r12)
            r15 = r5
            goto L_0x0109
        L_0x00bd:
            boolean r16 = r1.equals(r11)
            r15 = r8
            goto L_0x0109
        L_0x00c3:
            boolean r16 = r1.equals(r10)
            r15 = r7
            goto L_0x0109
        L_0x00c9:
            if (r1 == 0) goto L_0x0075
            int r16 = r1.hashCode()
            switch(r16) {
                case -1726419343: goto L_0x00fe;
                case -988389614: goto L_0x00f8;
                case -353089843: goto L_0x00f1;
                case -282676306: goto L_0x00ea;
                case -250076159: goto L_0x00e4;
                case -148942121: goto L_0x00df;
                case 42700686: goto L_0x00d9;
                case 1738222382: goto L_0x00d3;
                default: goto L_0x00d2;
            }
        L_0x00d2:
            goto L_0x0075
        L_0x00d3:
            boolean r16 = r1.equals(r8)
            r15 = r11
            goto L_0x0109
        L_0x00d9:
            boolean r16 = r1.equals(r7)
            r15 = r10
            goto L_0x0109
        L_0x00df:
            boolean r16 = r1.equals(r6)
            goto L_0x0109
        L_0x00e4:
            boolean r16 = r1.equals(r5)
            r15 = r12
            goto L_0x0109
        L_0x00ea:
            boolean r16 = r1.equals(r4)
            r15 = r17
            goto L_0x0109
        L_0x00f1:
            boolean r16 = r1.equals(r3)
            r15 = r18
            goto L_0x0109
        L_0x00f8:
            boolean r16 = r1.equals(r2)
            r15 = r9
            goto L_0x0109
        L_0x00fe:
            boolean r16 = r1.equals(r0)
            r15 = r14
            goto L_0x0109
        L_0x0104:
            boolean r16 = r1.equals(r9)
            r15 = r2
        L_0x0109:
            if (r16 != 0) goto L_0x0076
            goto L_0x0075
        L_0x010d:
            r16 = 0
            goto L_0x0046
        L_0x0111:
            int r0 = r2.indexOf(r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C360778f8.A01(X.8f8, X.8bb):int");
    }

    private final ArrayList A02() {
        ArrayList arrayList = new ArrayList();
        Iterator it = A03(this).iterator();
        0qQ.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            0qQ.A07(next);
            arrayList.add(new AXJ((C358868bb) next));
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0044, code lost:
        if (X.182.A06(X.0Tu.A06, r4, 36323139718359947L) == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0058, code lost:
        if (X.182.A06(X.0Tu.A06, r4, 36323139719015317L) != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005a, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        if (X.182.A06(X.0Tu.A06, r4, 36323139717835651L) == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a3, code lost:
        if (X.182.A06(r4, r5, 36323139718425484L) != false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a5, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ba, code lost:
        if (X.182.A06(X.0Tu.A06, r5, 36323139718556558L) == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ce, code lost:
        if (X.182.A06(X.0Tu.A06, r5, 36323139718818706L) != false) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d0, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e3, code lost:
        if (X.182.A06(X.0Tu.A06, r3, 36323139718491021L) == false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f7, code lost:
        if (X.182.A06(X.0Tu.A06, r3, 36323139718753169L) != false) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f9, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010c, code lost:
        if (X.182.A06(X.0Tu.A06, r7, 36323139718622095L) == false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0025, code lost:
        if (X.182.A06(X.0Tu.A05, r4, 36320704471507736L) != false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0120, code lost:
        if (X.182.A06(X.0Tu.A06, r7, 36323139718687632L) != false) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0122, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (X.AnonymousClass8IK.A08(r8.A0A) != false) goto L_0x005a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A03(X.C360778f8 r20) {
        /*
            r8 = r20
            X.8ao r0 = r8.A0D
            boolean r10 = r0.CQC()
            boolean r9 = r0.Ccc()
            boolean r5 = r0.CTU()
            r1 = 0
            if (r10 != 0) goto L_0x0027
            if (r9 == 0) goto L_0x01ad
            com.instagram.common.session.UserSession r4 = r8.A0A
            X.0qQ.A0B(r4, r1)
            X.0Tu r0 = X.0Tu.A05
            r2 = 36320704471507736(0x81097d00042318, double:3.032697987294862E-306)
            boolean r0 = X.182.A06(r0, r4, r2)
            if (r0 == 0) goto L_0x01ad
        L_0x0027:
            r7 = 1
            if (r10 == 0) goto L_0x0032
            com.instagram.common.session.UserSession r0 = r8.A0A
            boolean r0 = X.AnonymousClass8IK.A08(r0)
            if (r0 != 0) goto L_0x005a
        L_0x0032:
            if (r9 == 0) goto L_0x0046
            com.instagram.common.session.UserSession r4 = r8.A0A
            X.0qQ.A0B(r4, r1)
            X.0Tu r0 = X.0Tu.A06
            r2 = 36323139718359947(0x810bb4000a2b8b, double:3.0342380472101525E-306)
            boolean r0 = X.182.A06(r0, r4, r2)
            if (r0 != 0) goto L_0x005a
        L_0x0046:
            if (r5 == 0) goto L_0x01aa
            com.instagram.common.session.UserSession r4 = r8.A0A
            X.0qQ.A0B(r4, r1)
            X.0Tu r0 = X.0Tu.A06
            r2 = 36323139719015317(0x810bb400142b95, double:3.034238047624611E-306)
            boolean r0 = X.182.A06(r0, r4, r2)
            if (r0 == 0) goto L_0x01aa
        L_0x005a:
            r6 = 1
        L_0x005b:
            if (r10 == 0) goto L_0x007b
            com.instagram.common.session.UserSession r4 = r8.A0A
            boolean r0 = X.AnonymousClass8IK.A08(r4)
            if (r0 == 0) goto L_0x007b
            boolean r0 = X.AnonymousClass8IK.A09(r4)
            if (r0 == 0) goto L_0x007b
            X.0qQ.A0B(r4, r1)
            X.0Tu r0 = X.0Tu.A06
            r2 = 36323139717835651(0x810bb400022b83, double:3.0342380468785856E-306)
            boolean r0 = X.182.A06(r0, r4, r2)
            if (r0 != 0) goto L_0x00a5
        L_0x007b:
            if (r9 == 0) goto L_0x01a7
            com.instagram.common.session.UserSession r5 = r8.A0A
            X.0qQ.A0B(r5, r1)
            X.0Tu r4 = X.0Tu.A06
            r2 = 36323139718359947(0x810bb4000a2b8b, double:3.0342380472101525E-306)
            boolean r0 = X.182.A06(r4, r5, r2)
            if (r0 == 0) goto L_0x01a7
            r2 = 36323139718228873(0x810bb400082b89, double:3.034238047127261E-306)
            boolean r0 = X.182.A06(r4, r5, r2)
            if (r0 == 0) goto L_0x01a7
            r2 = 36323139718425484(0x810bb4000b2b8c, double:3.0342380472515984E-306)
            boolean r0 = X.182.A06(r4, r5, r2)
            if (r0 == 0) goto L_0x01a7
        L_0x00a5:
            r4 = 1
        L_0x00a6:
            if (r6 == 0) goto L_0x01b0
            if (r10 == 0) goto L_0x00bc
            com.instagram.common.session.UserSession r5 = r8.A0A
            X.0qQ.A0B(r5, r1)
            X.0Tu r0 = X.0Tu.A06
            r2 = 36323139718556558(0x810bb4000d2b8e, double:3.03423804733449E-306)
            boolean r0 = X.182.A06(r0, r5, r2)
            if (r0 != 0) goto L_0x00d0
        L_0x00bc:
            if (r9 == 0) goto L_0x01a4
            com.instagram.common.session.UserSession r5 = r8.A0A
            X.0qQ.A0B(r5, r1)
            X.0Tu r0 = X.0Tu.A06
            r2 = 36323139718818706(0x810bb400112b92, double:3.0342380475002735E-306)
            boolean r0 = X.182.A06(r0, r5, r2)
            if (r0 == 0) goto L_0x01a4
        L_0x00d0:
            r2 = 1
        L_0x00d1:
            if (r10 == 0) goto L_0x00e5
            com.instagram.common.session.UserSession r3 = r8.A0A
            X.0qQ.A0B(r3, r1)
            X.0Tu r0 = X.0Tu.A06
            r5 = 36323139718491021(0x810bb4000c2b8d, double:3.034238047293044E-306)
            boolean r0 = X.182.A06(r0, r3, r5)
            if (r0 != 0) goto L_0x00f9
        L_0x00e5:
            if (r9 == 0) goto L_0x01a1
            com.instagram.common.session.UserSession r3 = r8.A0A
            X.0qQ.A0B(r3, r1)
            X.0Tu r0 = X.0Tu.A06
            r5 = 36323139718753169(0x810bb400102b91, double:3.0342380474588277E-306)
            boolean r0 = X.182.A06(r0, r3, r5)
            if (r0 == 0) goto L_0x01a1
        L_0x00f9:
            r0 = 1
        L_0x00fa:
            if (r10 == 0) goto L_0x010e
            com.instagram.common.session.UserSession r7 = r8.A0A
            X.0qQ.A0B(r7, r1)
            X.0Tu r3 = X.0Tu.A06
            r5 = 36323139718622095(0x810bb4000e2b8f, double:3.034238047375936E-306)
            boolean r3 = X.182.A06(r3, r7, r5)
            if (r3 != 0) goto L_0x0122
        L_0x010e:
            if (r9 == 0) goto L_0x0123
            com.instagram.common.session.UserSession r7 = r8.A0A
            X.0qQ.A0B(r7, r1)
            X.0Tu r3 = X.0Tu.A06
            r5 = 36323139718687632(0x810bb4000f2b90, double:3.034238047417382E-306)
            boolean r3 = X.182.A06(r3, r7, r5)
            if (r3 == 0) goto L_0x0123
        L_0x0122:
            r1 = 1
        L_0x0123:
            com.instagram.common.session.UserSession r8 = r8.A0A
            r3 = 0
            X.0qQ.A0B(r8, r3)
            X.0Tu r7 = X.0Tu.A06
            r5 = 36331124061979556(0x8112f7000143a4, double:3.0392873782655644E-306)
            boolean r6 = X.182.A06(r7, r8, r5)
            java.lang.String r5 = "modern_refreshed_v2"
            X.8bb r7 = X.C358878bc.A01(r5, r4, r2, r0, r1)
            java.lang.String r5 = "ig_classic"
            X.8bb r8 = X.C358878bc.A01(r5, r3, r2, r0, r1)
            java.lang.String r5 = "ig_signature"
            X.8bb r9 = X.C358878bc.A01(r5, r3, r2, r0, r1)
            java.lang.String r5 = "ig_editor"
            X.8bb r10 = X.C358878bc.A01(r5, r3, r2, r0, r1)
            java.lang.String r5 = "ig_poster"
            X.8bb r11 = X.C358878bc.A01(r5, r3, r2, r0, r1)
            java.lang.String r5 = "ig_bubble"
            X.8bb r12 = X.C358878bc.A01(r5, r3, r2, r0, r1)
            java.lang.String r5 = "ig_deco"
            X.8bb r13 = X.C358878bc.A01(r5, r3, r2, r0, r1)
            java.lang.String r5 = "ig_squeeze"
            X.8bb r14 = X.C358878bc.A01(r5, r3, r2, r0, r1)
            java.lang.String r5 = "typewriter_v2"
            X.8bb r15 = X.C358878bc.A01(r5, r4, r2, r0, r1)
            java.lang.String r5 = "strong_v2"
            X.8bb r16 = X.C358878bc.A01(r5, r4, r2, r0, r1)
            java.lang.String r5 = "meme"
            X.8bb r17 = X.C358878bc.A01(r5, r4, r2, r0, r1)
            java.lang.String r5 = "elegant"
            X.8bb r18 = X.C358878bc.A01(r5, r4, r2, r0, r1)
            java.lang.String r5 = "directional"
            X.8bb r19 = X.C358878bc.A01(r5, r4, r2, r0, r1)
            java.lang.String r4 = "ig_literature"
            X.8bb r20 = X.C358878bc.A01(r4, r3, r2, r0, r1)
            X.8bb[] r4 = new X.C358868bb[]{r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20}
            java.util.ArrayList r5 = X.0sr.A1M(r4)
            if (r6 == 0) goto L_0x019b
            java.lang.String r4 = "halloween"
            X.8bb r0 = X.C358878bc.A01(r4, r3, r2, r0, r1)
            r5.add(r3, r0)
        L_0x019b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r5)
            return r1
        L_0x01a1:
            r0 = 0
            goto L_0x00fa
        L_0x01a4:
            r2 = 0
            goto L_0x00d1
        L_0x01a7:
            r4 = 0
            goto L_0x00a6
        L_0x01aa:
            r6 = 0
            goto L_0x005b
        L_0x01ad:
            r7 = 0
            goto L_0x0032
        L_0x01b0:
            if (r7 == 0) goto L_0x01c4
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r0 = X.C358878bc.A08()
            r1.addAll(r0)
            java.util.ArrayList r0 = r8.A0E
            r1.addAll(r0)
            return r1
        L_0x01c4:
            java.util.ArrayList r1 = r8.A0E
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C360778f8.A03(X.8f8):java.util.ArrayList");
    }

    public static final void A04(C360778f8 r3, int i, boolean z) {
        int i2;
        if (!z && r3.A0D.C5G() > 60) {
            return;
        }
        if (i == r3.A00()) {
            if (r3.A0D.CQC()) {
                i2 = r3.A01;
            } else {
                i2 = r3.A00;
            }
            if (i2 != i && z) {
                A05(r3, i, true);
                27r A012 = 27p.A01(r3.A0A);
                String str = r3.A07().A09;
                29Z r4 = A012.A0F;
                0qQ.A0B(str, 0);
                0wc r2 = r4.A01;
                0Aj A002 = r2.A00(r2.A00, "ig_camera_ui_tool_click");
                if (A002.isSampled()) {
                    A002.A8M(AnonymousClass80P.TEXT_FORMAT, "tool_type");
                    A002.AAJ("legacy_falco_event_name", "IG_CAMERA_TEXT_FORMAT_SELECTED");
                    AnonymousClass283 r32 = r4.A04;
                    String str2 = r32.A0L;
                    if (str2 == null) {
                        str2 = "";
                    }
                    A002.AAJ("camera_session_id", str2);
                    int i3 = 2;
                    if (r32.A01 != 2) {
                        i3 = 1;
                    }
                    A002.A8k("camera_position", Integer.valueOf(i3));
                    A002.A8M(r4.A0I(), "capture_type");
                    A002.A8M(r32.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    A002.A8k("event_type", 2);
                    A002.AAJ("format", str);
                    A002.A8M(r32.A0A, "media_type");
                    A002.AAJ("module", 27x.A08.getModuleName());
                    A002.A8M(r32.A0C, "surface");
                    A002.A8M(r4.A0J(), "camera_destination");
                    A002.A8M(r32.A0A, "composition_media_type");
                    A002.AAJ("composition_str_id", r32.A0M);
                    A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                    A002.Cgf();
                    return;
                }
                return;
            }
            return;
        }
        A05(r3, i, false);
        r3.A09();
        r3.A0D.Dr2(r3.A07(), AnonymousClass05K.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if (X.182.A06(r2, r3, 36323139718228873L) == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (X.182.A06(r2, r3, 36323139719277465L) == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A06(boolean r9) {
        /*
            r8 = this;
            X.8ao r5 = r8.A0D
            boolean r0 = r5.CQC()
            r7 = 1
            if (r0 == 0) goto L_0x0014
            com.instagram.common.session.UserSession r3 = r8.A0A
            if (r9 == 0) goto L_0x0066
            boolean r0 = X.AnonymousClass8IK.A09(r3)
        L_0x0011:
            r6 = 1
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            r6 = 0
        L_0x0015:
            boolean r0 = r5.Ccc()
            if (r0 == 0) goto L_0x0031
            com.instagram.common.session.UserSession r3 = r8.A0A
            r0 = 0
            if (r9 == 0) goto L_0x0060
            X.0qQ.A0B(r3, r0)
            X.0Tu r2 = X.0Tu.A06
        L_0x0025:
            r0 = 36323139718228873(0x810bb400082b89, double:3.034238047127261E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r4 = 1
            if (r0 != 0) goto L_0x0032
        L_0x0031:
            r4 = 0
        L_0x0032:
            boolean r0 = r5.CTU()
            if (r0 == 0) goto L_0x004e
            com.instagram.common.session.UserSession r3 = r8.A0A
            r0 = 0
            if (r9 == 0) goto L_0x005a
            X.0qQ.A0B(r3, r0)
            X.0Tu r2 = X.0Tu.A06
        L_0x0042:
            r0 = 36323139719277465(0x810bb400182b99, double:3.0342380477903946E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 1
            if (r0 != 0) goto L_0x004f
        L_0x004e:
            r1 = 0
        L_0x004f:
            androidx.recyclerview.widget.RecyclerView r0 = r8.A09
            if (r0 == 0) goto L_0x0076
            if (r6 != 0) goto L_0x0059
            if (r4 != 0) goto L_0x0059
            if (r1 == 0) goto L_0x0076
        L_0x0059:
            return r7
        L_0x005a:
            X.0qQ.A0B(r3, r0)
            X.0Tu r2 = X.0Tu.A05
            goto L_0x0042
        L_0x0060:
            X.0qQ.A0B(r3, r0)
            X.0Tu r2 = X.0Tu.A05
            goto L_0x0025
        L_0x0066:
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323139717770114(0x810bb400012b82, double:3.03423804683714E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            goto L_0x0011
        L_0x0076:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C360778f8.A06(boolean):boolean");
    }

    public final void afterTextChanged(Editable editable) {
        if (!this.A06) {
            A09();
        }
    }

    public static final void A05(C360778f8 r2, int i, boolean z) {
        ArrayList A032 = A03(r2);
        if (i < 0) {
            i = 0;
        }
        if (i >= A032.size()) {
            i = A032.size() - 1;
        }
        boolean CQC = r2.A0D.CQC();
        if (z) {
            if (CQC) {
                r2.A01 = i;
            } else {
                r2.A00 = i;
            }
        } else if (CQC) {
            r2.A05 = i;
        } else {
            r2.A04 = i;
        }
    }

    public final C358868bb A07() {
        Object obj;
        int A002 = A00();
        ArrayList A032 = A03(this);
        if (A002 >= 0) {
            try {
                if (A002 < A032.size()) {
                    obj = A032.get(A002);
                    return (C358868bb) obj;
                }
            } catch (Exception e) {
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("getCurrentFormat() exception=%s.  isClips=%s.  curIdx=%d.   formatsSize=%d.", e.getLocalizedMessage(), Boolean.valueOf(this.A0D.CQC()), Integer.valueOf(A002), Integer.valueOf(A032.size()));
                0qQ.A07(formatStrLocaleSafe);
                0kD.A07("TextFormatController", formatStrLocaleSafe, (Throwable) null);
                throw e;
            }
        }
        this.A05 = 0;
        this.A04 = 0;
        obj = (C358868bb) A032.get(0);
        return (C358868bb) obj;
    }

    public final boolean Dqe(View view) {
        A05(this, (A00() + 1) % A03(this).size(), false);
        A09();
        this.A0D.Dr2(A07(), AnonymousClass05K.A01);
        return true;
    }

    public final void DML(int i, boolean z) {
        A04(this, i, z);
    }
}
