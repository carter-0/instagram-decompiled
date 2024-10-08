package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.9i1  reason: invalid class name and case insensitive filesystem */
public final class C384869i1 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "RemixAudioControlFragment";
    public AnonymousClass8BA A00;
    public Integer A01;
    public boolean A02;
    public 2Rw A03;
    public RecyclerView A04;
    public String A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);

    public final String getModuleName() {
        return "remix_audio_control_sheet";
    }

    private final boolean A00() {
        AnonymousClass8BA r1 = this.A00;
        if (r1 == null) {
            0qQ.A0F("delegate");
            throw AnonymousClass00P.createAndThrow();
        }
        if (!r1.A11.A03) {
            C3506485o r0 = r1.A10;
            r0.getClass();
            if (r0.A03) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return (AnonymousClass0wW) this.A06.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0048, code lost:
        if (r2 == X.AnonymousClass05K.A00) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            r0 = -357788917(0xffffffffeaac930b, float:-1.0431482E26)
            int r4 = X.AnonymousClass0fD.A02(r0)
            X.C384869i1.super.onCreate(r6)
            android.os.Bundle r2 = r5.mArguments
            X.0qQ.A0A(r2)
            java.lang.String r0 = "other_username"
            java.lang.String r0 = X.C320236s2.A01(r2, r0)
            r5.A05 = r0
            java.lang.String r1 = "is_precapture"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            r5.A02 = r0
            X.8BA r1 = r5.A00
            java.lang.String r0 = "delegate"
            if (r1 != 0) goto L_0x002e
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x002e:
            X.85o r0 = r1.A11
            boolean r0 = r0.A00
            r3 = r0 ^ 1
            X.85o r1 = r1.A10
            r1.getClass()
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x004a
            java.lang.Integer r2 = r1.A01()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r2 == r0) goto L_0x004a
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r0 = 1
            if (r2 != r1) goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            if (r3 == 0) goto L_0x005d
            if (r0 == 0) goto L_0x005a
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x0051:
            r5.A01 = r0
            r0 = 1241459738(0x49ff2c1a, float:2090371.2)
            X.AnonymousClass0fD.A09(r0, r4)
            return
        L_0x005a:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0051
        L_0x005d:
            if (r0 == 0) goto L_0x0062
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0051
        L_0x0062:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C384869i1.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f2, code lost:
        if (A00() != false) goto L_0x00f4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r13, android.view.ViewGroup r14, android.os.Bundle r15) {
        /*
            r12 = this;
            r0 = -892867558(0xffffffffcac7ec1a, float:-6551053.0)
            int r2 = X.AnonymousClass0fD.A02(r0)
            android.content.Context r0 = r12.requireContext()
            androidx.recyclerview.widget.LinearLayoutManager r11 = new androidx.recyclerview.widget.LinearLayoutManager
            r11.<init>(r0)
            float r0 = androidx.recyclerview.widget.RecyclerView.A1E
            android.content.Context r1 = r12.requireContext()
            r0 = 0
            androidx.recyclerview.widget.RecyclerView r4 = new androidx.recyclerview.widget.RecyclerView
            r4.<init>(r1, r0)
            r4.setItemAnimator(r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131165498(0x7f07013a, float:1.7945215E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r3 = 0
            r4.setPadding(r3, r3, r3, r0)
            r4.setLayoutManager(r11)
            r12.A04 = r4
            X.8BA r0 = r12.A00
            if (r0 != 0) goto L_0x0041
            java.lang.String r9 = "delegate"
        L_0x0039:
            X.0qQ.A0F(r9)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0041:
            X.85o r0 = r0.A10
            r0.getClass()
            boolean r0 = r0.A0B
            r4 = 1
            r7 = r0 ^ 1
            boolean r0 = r12.A02
            java.lang.String r9 = "otherUsername"
            r5 = 2
            if (r0 == 0) goto L_0x00ae
            boolean r0 = r12.A00()
            if (r0 != 0) goto L_0x00ae
            r0 = 2131974291(0x7f135893, float:1.9585642E38)
            java.lang.String r0 = r12.getString(r0)
            X.0qQ.A07(r0)
            X.Ew0 r8 = new X.Ew0
            r8.<init>(r0, r4)
            r1 = 2131974287(0x7f13588f, float:1.9585634E38)
            java.lang.String r0 = r12.A05
            if (r0 == 0) goto L_0x0039
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r12.getString(r1, r0)
            X.0qQ.A07(r0)
            X.Ew0 r6 = new X.Ew0
            r6.<init>(r0, r7)
            r0 = 2131974284(0x7f13588c, float:1.9585628E38)
            java.lang.String r1 = r12.getString(r0)
            X.0qQ.A07(r1)
            X.Ew0 r0 = new X.Ew0
            r0.<init>(r1, r7)
            X.Ew0[] r14 = new X.C49459Ew0[]{r8, r6, r0}
        L_0x0091:
            boolean r0 = r12.A00()
            java.lang.String r9 = "currentRemixAudioSelection"
            if (r0 == 0) goto L_0x00d9
            java.lang.Integer r1 = r12.A01
            if (r1 == 0) goto L_0x0039
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x00d9
            java.lang.String r0 = "Logical inconsistency detected: music sticker was present, but both audio channels were enabled"
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            r0 = -1029865694(0xffffffffc29d7f22, float:-78.74831)
            X.AnonymousClass0fD.A09(r0, r2)
            throw r1
        L_0x00ae:
            r0 = 2131974291(0x7f135893, float:1.9585642E38)
            java.lang.String r0 = r12.getString(r0)
            X.0qQ.A07(r0)
            X.Ew0 r6 = new X.Ew0
            r6.<init>(r0, r4)
            r1 = 2131974287(0x7f13588f, float:1.9585634E38)
            java.lang.String r0 = r12.A05
            if (r0 == 0) goto L_0x0039
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = r12.getString(r1, r0)
            X.0qQ.A07(r1)
            X.Ew0 r0 = new X.Ew0
            r0.<init>(r1, r7)
            X.Ew0[] r14 = new X.C49459Ew0[]{r6, r0}
            goto L_0x0091
        L_0x00d9:
            java.lang.Integer r0 = r12.A01
            if (r0 == 0) goto L_0x0039
            int r0 = r0.intValue()
            if (r0 == r3) goto L_0x0115
            if (r0 == r4) goto L_0x0110
            if (r0 == r5) goto L_0x011a
            X.0sl r13 = X.0sl.A00
        L_0x00e9:
            boolean r0 = r12.A02
            if (r0 != 0) goto L_0x00f4
            boolean r0 = r12.A00()
            r15 = 0
            if (r0 == 0) goto L_0x00f5
        L_0x00f4:
            r15 = 1
        L_0x00f5:
            X.Dm8 r10 = new X.Dm8
            r10.<init>(r11, r12, r13, r14, r15)
            r12.A03 = r10
            androidx.recyclerview.widget.RecyclerView r0 = r12.A04
            java.lang.String r9 = "recyclerView"
            if (r0 == 0) goto L_0x0039
            r0.setAdapter(r10)
            androidx.recyclerview.widget.RecyclerView r1 = r12.A04
            if (r1 == 0) goto L_0x0039
            r0 = -80593982(0xfffffffffb323bc2, float:-9.254409E35)
            X.AnonymousClass0fD.A09(r0, r2)
            return r1
        L_0x0110:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x0122
        L_0x0115:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L_0x0122
        L_0x011a:
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x012a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
        L_0x0122:
            java.util.Set r13 = java.util.Collections.singleton(r0)
            X.0qQ.A07(r13)
            goto L_0x00e9
        L_0x012a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r1, r0}
            X.0qQ.A0B(r0, r3)
            java.util.Set r13 = X.03t.A0K(r0)
            goto L_0x00e9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C384869i1.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onStop() {
        int i;
        String str;
        int A022 = AnonymousClass0fD.A02(294761214);
        C384869i1.super.onStop();
        if (this.A01 == null) {
            i = 2109499050;
        } else {
            if (this.A02 && !C394329xu.A00(requireContext())) {
                Integer num = this.A01;
                if (num == null) {
                    str = "currentRemixAudioSelection";
                } else if (num == AnonymousClass05K.A0C) {
                    Context requireContext = requireContext();
                    String str2 = this.A05;
                    if (str2 == null) {
                        str = "otherUsername";
                    } else {
                        C59689JTv.A00(requireContext, getString(2131974289, new Object[]{str2}), (String) null, 1);
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            i = 347204203;
        }
        AnonymousClass0fD.A09(i, A022);
    }
}
