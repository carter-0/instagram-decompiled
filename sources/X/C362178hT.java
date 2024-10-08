package X;

import android.content.Context;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.Folder;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* renamed from: X.8hT  reason: invalid class name and case insensitive filesystem */
public final class C362178hT implements AnonymousClass8XT, AnonymousClass8XQ, AnonymousClass8ZY {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass9I1 A03;
    public C362048hG A04;
    public C65796Lzo A05;
    public Integer A06;
    public String A07;
    public List A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final int A0F;
    public final Context A0G;
    public final AnonymousClass4DH A0H;
    public final AnonymousClass0iw A0I;
    public final UserSession A0J;
    public final C357638Yz A0K;
    public final C361588gT A0L;
    public final AnonymousClass8HT A0M;
    public final C362168hS A0N;
    public final C2801950r A0O;
    public final C227382jA A0P;
    public final AnonymousClass0eM A0Q = AnonymousClass0eN.A01(new C377269Le(this, 4));
    public final AnonymousClass0eM A0R;
    public final AnonymousClass0eM A0S;
    public volatile Integer A0T;

    public final void DCx(Exception exc) {
        0qQ.A0B(exc, 0);
        AnonymousClass8HT r0 = this.A0M;
        String obj = exc.toString();
        0qQ.A0B(obj, 0);
        r0.A03.A07(obj, "", 518928411, r0.A01);
        UserSession userSession = this.A0J;
        02m r3 = 02m.A0p;
        r3.markerAnnotate(17629202, "is_current_folder_empty", true);
        r3.markerEnd(17629202, 3);
        String str = "";
        if (this.A0K.A08.A00 instanceof AnonymousClass80O) {
            27r A012 = 27p.A01(userSession);
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            AnonymousClass283 r02 = A012.A04;
            r02.A04 = A012.A00.A07(message, "", 838604704, r02.A04);
        }
        if (this.A06 != null) {
            2Nl A002 = 2Nk.A00(userSession);
            String message2 = exc.getMessage();
            if (message2 != null) {
                str = message2;
            }
            A002.A01 = A002.A04.A07(str, "", 17638606, A002.A01);
            this.A06 = null;
        }
        this.A0T = null;
        29L r32 = 27p.A01(userSession).A0J;
        C2801950r r2 = this.A0O;
        String message3 = exc.getMessage();
        if (message3 == null) {
            message3 = "error loading media";
        }
        if (r32.A05.Aji() == C279294yP.CLIPS && r2 == C2801950r.CLIPS) {
            r32.A00 = r32.A04.A07(message3, "", 585177795, r32.A00);
        }
        this.A01 = AnonymousClass972.MUTABLE_FLAG_MASK;
        C362048hG A032 = A03();
        A032.A0R.postDelayed(A032.A1G, 300);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:131:0x038a, code lost:
        if (r7 != null) goto L_0x038c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03cf A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01da A[LOOP:3: B:64:0x01d4->B:66:0x01da, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DQY(X.AnonymousClass8XW r12, java.util.List r13, java.util.List r14, int r15) {
        /*
            r11 = this;
            r3 = 1
            X.0qQ.A0B(r13, r3)
            r7 = 2
            X.0qQ.A0B(r14, r7)
            com.instagram.common.session.UserSession r4 = r11.A0J
            boolean r6 = r14.isEmpty()
            r2 = 0
            X.02m r5 = X.02m.A0p
            r1 = 17629202(0x10d0012, float:2.589766E-38)
            java.lang.String r0 = "is_current_folder_empty"
            r5.markerAnnotate(r1, r0, r6)
            r5.markerEnd(r1, r7)
            X.8Yz r0 = r11.A0K
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x0039
            X.27r r0 = X.27p.A01(r4)
            X.283 r7 = r0.A04
            X.29E r6 = r0.A00
            long r0 = r7.A04
            r5 = 838604704(0x31fc17a0, float:7.336851E-9)
            long r0 = r6.A02(r5, r0)
            r7.A04 = r0
        L_0x0039:
            int r0 = r11.A0F
            if (r15 != r0) goto L_0x0055
            java.lang.Integer r0 = r11.A06
            if (r0 == 0) goto L_0x0055
            X.2Nl r7 = X.2Nk.A00(r4)
            X.29E r6 = r7.A04
            long r0 = r7.A01
            r5 = 17638606(0x10d24ce, float:2.5924016E-38)
            long r0 = r6.A02(r5, r0)
            r7.A01 = r0
            r0 = 0
            r11.A06 = r0
        L_0x0055:
            boolean r0 = r11.A0A
            if (r0 != 0) goto L_0x0076
            X.8hG r0 = r11.A03()
            android.app.Activity r0 = r0.A0N
            boolean r0 = X.C2604245p.A03(r0)
            if (r0 == 0) goto L_0x0076
            r11.A0A = r3
            X.8HT r7 = r11.A0M
            X.29E r6 = r7.A03
            long r0 = r7.A01
            r5 = 518928411(0x1eee381b, float:2.5222435E-20)
            long r0 = r6.A02(r5, r0)
            r7.A01 = r0
        L_0x0076:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r11.A01 = r0
            X.8hG r0 = r11.A03()
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x00a8
            X.0eM r0 = r11.A0R
            java.lang.Object r0 = r0.getValue()
            X.8XW r0 = (X.AnonymousClass8XW) r0
            X.8XU r0 = r0.A0A
            X.8Qr r0 = r0.A09
            r0.AHU()
            long r2 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            int r0 = (int) r2
            r11.A00 = r0
            X.JVm r1 = X.AnonymousClass9PJ.A00(r4)
            java.lang.String r0 = "Gallery Closed"
            X.0JA.A01()
            X.C59728JVm.A01(r1, r0)
        L_0x00a7:
            return
        L_0x00a8:
            X.0eM r5 = r11.A0Q
            java.lang.Object r1 = r5.getValue()
            X.8iK r1 = (X.C362688iK) r1
            java.util.List r0 = java.util.Collections.emptyList()
            r1.A00 = r0
            X.8hG r1 = r11.A03()
            X.8XG r0 = r1.A0u
            r0.A01(r14)
            X.8iL r0 = r1.A0p
            r0.A01()
            java.util.Iterator r10 = r13.iterator()
            boolean r0 = r10.hasNext()
            r6 = 0
            if (r0 == 0) goto L_0x00f9
            java.lang.Object r0 = r10.next()
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0
            long r0 = r0.A0C
            r8 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r8
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
        L_0x00de:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00fc
            java.lang.Object r0 = r10.next()
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0
            long r0 = r0.A0C
            long r0 = r0 * r8
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            int r0 = r7.compareTo(r1)
            if (r0 <= 0) goto L_0x00de
            r7 = r1
            goto L_0x00de
        L_0x00f9:
            r0 = 0
            goto L_0x0102
        L_0x00fc:
            if (r7 == 0) goto L_0x00f9
            long r0 = r7.longValue()
        L_0x0102:
            r7 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r7
            int r7 = (int) r0
            r11.A00 = r7
            boolean r0 = r11.A09
            if (r0 != 0) goto L_0x018d
            X.4DH r0 = r11.A0H
            android.os.Bundle r1 = r0.requireArguments()
            java.lang.String r0 = "ARGS_DEFAULT_FOLDER_NAME"
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r8 = "Meta View"
            if (r1 == 0) goto L_0x01e8
            boolean r0 = r1.equals(r8)
            if (r0 == 0) goto L_0x01e8
            java.lang.Object r0 = r5.getValue()
            X.8iK r0 = (X.C362688iK) r0
            java.util.List r0 = r0.A00
            java.util.Iterator r7 = r0.iterator()
        L_0x012e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0149
            java.lang.Object r1 = r7.next()
            com.instagram.ui.widget.mediapicker.Folder r1 = (com.instagram.ui.widget.mediapicker.Folder) r1
            java.lang.String r0 = r1.A03
            if (r0 == 0) goto L_0x012e
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x012e
            r11.A09 = r3
            r11.A02(r1)
        L_0x0149:
            boolean r0 = r11.A09
            if (r0 != 0) goto L_0x017a
            java.lang.Object r0 = r5.getValue()
            X.8iK r0 = (X.C362688iK) r0
            java.util.List r0 = r0.A00
            java.util.Iterator r8 = r0.iterator()
        L_0x0159:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x017a
            java.lang.Object r7 = r8.next()
            com.instagram.ui.widget.mediapicker.Folder r7 = (com.instagram.ui.widget.mediapicker.Folder) r7
            java.lang.String r1 = r7.A03
            if (r1 == 0) goto L_0x0159
            r0 = 1004(0x3ec, float:1.407E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0159
            r11.A09 = r3
            r11.A02(r7)
        L_0x017a:
            boolean r0 = r11.A09
            if (r0 != 0) goto L_0x018d
            X.0eM r0 = r11.A0R
            java.lang.Object r0 = r0.getValue()
            X.8XW r0 = (X.AnonymousClass8XW) r0
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x018d
            r11.A00()
        L_0x018d:
            X.8hG r1 = r11.A03()
            java.lang.Object r0 = r5.getValue()
            X.8iK r0 = (X.C362688iK) r0
            X.8XW r0 = r0.A03
            com.instagram.ui.widget.mediapicker.Folder r0 = r0.A02
            java.lang.String r0 = r0.A03
            if (r0 != 0) goto L_0x01a1
            java.lang.String r0 = ""
        L_0x01a1:
            r1.A0d(r0)
            X.4DH r9 = r11.A0H
            android.os.Bundle r0 = r9.requireArguments()
            java.lang.String r8 = "META_GALLERY_ALBUM_TYPE"
            java.lang.String r0 = r0.getString(r8)
            if (r0 == 0) goto L_0x025b
            int r0 = r0.length()
            if (r0 == 0) goto L_0x025b
            X.8gT r0 = r11.A0L
            X.0qQ.A0B(r0, r2)
            X.0Ud r0 = r0.A06
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x01d4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x022a
            java.lang.Object r0 = r1.next()
            X.9JL r0 = (X.AnonymousClass9JL) r0
            X.Lzo r0 = X.AnonymousClass9Q0.A00(r0)
            r7.add(r0)
            goto L_0x01d4
        L_0x01e8:
            com.instagram.api.schemas.GalleryMediaFolderEnum r0 = com.instagram.api.schemas.GalleryMediaFolderEnum.VIDEOS
            java.lang.String r0 = r0.A00
            boolean r0 = X.00p.A0j(r1, r0, r2)
            r11.A09 = r3
            if (r0 == 0) goto L_0x018d
            java.lang.Object r0 = r5.getValue()
            X.8iK r0 = (X.C362688iK) r0
            r8 = -3
            X.8XW r0 = r0.A03
            java.util.Map r0 = r0.A04
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r7 = r0.iterator()
        L_0x0207:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x018d
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getValue()
            com.instagram.ui.widget.mediapicker.Folder r0 = (com.instagram.ui.widget.mediapicker.Folder) r0
            int r0 = r0.A02
            if (r0 != r8) goto L_0x0207
            java.lang.Object r0 = r1.getValue()
            com.instagram.ui.widget.mediapicker.Folder r0 = (com.instagram.ui.widget.mediapicker.Folder) r0
            if (r0 == 0) goto L_0x018d
            r11.A02(r0)
            goto L_0x018d
        L_0x022a:
            java.util.Iterator r10 = r7.iterator()
        L_0x022e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x03cf
            java.lang.Object r7 = r10.next()
            r0 = r7
            X.Lzo r0 = (X.C65796Lzo) r0
            java.lang.String r1 = r0.A01
            android.os.Bundle r0 = r9.requireArguments()
            java.lang.String r0 = r0.getString(r8)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x022e
        L_0x024b:
            X.Lzo r7 = (X.C65796Lzo) r7
            if (r7 == 0) goto L_0x03b1
            A01(r11)
            X.8hG r0 = r11.A03()
            r0.DSA(r7)
            r11.A0C = r2
        L_0x025b:
            java.lang.Integer r0 = r11.A0T
            if (r0 == 0) goto L_0x026e
            r11.A0T = r6
            X.27r r0 = X.27p.A01(r4)
            X.29L r6 = r0.A0J
            X.50r r1 = r11.A0O
            java.lang.String r0 = "media_loaded"
            r6.A03(r1, r0)
        L_0x026e:
            X.8hG r0 = r11.A03()
            boolean r0 = r0.A0C
            if (r0 == 0) goto L_0x00a7
            X.8hG r0 = r11.A03()
            android.app.Activity r0 = r0.A0N
            boolean r0 = X.C2604245p.A03(r0)
            if (r0 == 0) goto L_0x03aa
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x03aa
            X.8gT r0 = r11.A0L
            X.0qQ.A0B(r0, r2)
            X.0Ud r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x03aa
            X.8hG r8 = r11.A03()
            r0 = 1
        L_0x02a2:
            android.view.View r7 = r8.A01
            if (r0 != 0) goto L_0x0367
            if (r7 == 0) goto L_0x02ad
            r6 = 8
        L_0x02aa:
            r7.setVisibility(r6)
        L_0x02ad:
            X.8hG r0 = r11.A03()
            X.28D r1 = r0.A03
            X.28D r0 = X.28D.A1M
            if (r1 != r0) goto L_0x0306
            java.lang.Object r0 = r5.getValue()
            X.8iK r0 = (X.C362688iK) r0
            X.8XW r0 = r0.A03
            com.instagram.ui.widget.mediapicker.Folder r0 = r0.A02
            java.lang.String r1 = r0.A03
            if (r1 == 0) goto L_0x0306
            java.lang.String r0 = "Meta View"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x02e5
            r0 = 1004(0x3ec, float:1.407E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x02e5
            r0 = 4348(0x10fc, float:6.093E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0306
        L_0x02e5:
            X.8hG r0 = r11.A03()
            android.app.Activity r0 = r0.A0N
            boolean r0 = X.C2604245p.A03(r0)
            if (r0 == 0) goto L_0x0306
            java.lang.Object r0 = r5.getValue()
            X.8iK r0 = (X.C362688iK) r0
            X.8XW r0 = r0.A03
            com.instagram.ui.widget.mediapicker.Folder r0 = r0.A02
            java.util.Set r0 = r0.A05
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0306
            r11.A00()
        L_0x0306:
            X.8hG r0 = r11.A03()
            android.view.View r5 = r0.A0R
            java.lang.Runnable r2 = r0.A1G
            r0 = 300(0x12c, double:1.48E-321)
            r5.postDelayed(r2, r0)
            X.8hG r5 = r11.A03()
            X.7Ge r0 = r5.A0z
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0345
            com.instagram.common.session.UserSession r2 = r5.A0c
            X.7zN r1 = X.C348967zN.A00
            java.lang.Class<X.7zO> r0 = X.C348977zO.class
            java.lang.Object r0 = r2.A01(r0, r1)
            X.7zO r0 = (X.C348977zO) r0
            java.util.Map r2 = r0.A00
            int r0 = r2.size()
            if (r0 <= r3) goto L_0x0336
            r5.A0h(r3)
        L_0x0336:
            r0 = 16
            X.9LZ r1 = new X.9LZ
            r1.<init>(r5, r0)
            X.9Pr r0 = new X.9Pr
            r0.<init>(r1)
            r2.forEach(r0)
        L_0x0345:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327387440560527(0x810f910003398f, double:3.036924323834004E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x035f
            X.8hG r2 = r11.A03()
            X.8hz r1 = r2.A0m
            X.9Pj r0 = new X.9Pj
            r0.<init>(r2)
            r1.A00 = r0
        L_0x035f:
            X.JVm r0 = X.AnonymousClass9PJ.A00(r4)
            r0.A02()
            return
        L_0x0367:
            r6 = 0
            if (r7 != 0) goto L_0x038c
            android.content.Context r0 = r8.A0O
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r0)
            r0 = 2131626691(0x7f0e0ac3, float:1.8880625E38)
            android.view.ViewGroup r1 = r8.A0S
            android.view.View r7 = r7.inflate(r0, r1, r2)
            r0 = 2131433453(0x7f0b17ed, float:1.8488692E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.0qQ.A07(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.addView(r7)
            r8.A01 = r7
            if (r7 == 0) goto L_0x02ad
        L_0x038c:
            r0 = 2131433459(0x7f0b17f3, float:1.8488704E38)
            android.view.View r2 = r7.requireViewById(r0)
            X.0qQ.A07(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.app.Activity r0 = r8.A0N
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131962957(0x7f132c4d, float:1.9562654E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setText(r0)
            goto L_0x02aa
        L_0x03aa:
            X.8hG r8 = r11.A03()
            r0 = 0
            goto L_0x02a2
        L_0x03b1:
            X.8hG r0 = r11.A03()
            X.6ST r0 = r0.A1D
            X.AnonymousClass0fN.A00(r0)
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r8 = new android.os.Handler
            r8.<init>(r0)
            X.Ajf r7 = new X.Ajf
            r7.<init>(r11)
            r0 = 3000(0xbb8, double:1.482E-320)
            r8.postDelayed(r7, r0)
            goto L_0x025b
        L_0x03cf:
            r7 = 0
            goto L_0x024b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C362178hT.DQY(X.8XW, java.util.List, java.util.List, int):void");
    }

    public final void DSA(C357268Xf r8) {
        AnonymousClass9I1 r3;
        0qQ.A0B(r8, 0);
        Folder ACT = r8.ACT();
        if (ACT != null) {
            A02(ACT);
        }
        C65796Lzo ACa = r8.ACa();
        if (ACa != null && !ACa.equals(this.A05)) {
            this.A05 = ACa;
            C362048hG A032 = A03();
            A032.A0m.A00 = new AnonymousClass9W1(A032);
            String str = ACa.A02;
            String str2 = ACa.A01;
            this.A07 = str;
            AnonymousClass8XW r0 = (AnonymousClass8XW) this.A0R.getValue();
            r0.A06 = true;
            AnonymousClass8XX r32 = r0.A01;
            if (r32 != null) {
                r32.Ecr((Integer) null, "META_GALLERY", new ArrayList());
            }
            this.A0B = true;
            this.A0L.A05(str2, AnonymousClass9PQ.A00((C279284yO) this.A0K.A08.A00), new C66309MMs(this, 15));
            this.A0N.A0J.Epw(str2);
            A03().A0d(str);
        }
        if (182.A06(0Tu.A05, this.A0J, 36330398212506217L)) {
            Object obj = this.A0K.A08.A00;
            if (obj instanceof AnonymousClass80O) {
                AnonymousClass9I1 r02 = this.A03;
                r3 = new AnonymousClass9I1(r02.A01, r8.BEU(), 1);
            } else if (obj instanceof AnonymousClass9QA) {
                r3 = new AnonymousClass9I1(r8.BEU(), this.A03.A00, 1);
            } else {
                r3 = this.A03;
            }
            this.A03 = r3;
        }
    }

    public final void DpR(List list) {
        this.A08 = list;
        0tS A002 = 0tS.A4E.A00();
        if (((Boolean) A002.A2g.CDM(A002, 0tS.A4G[116])).booleanValue()) {
            Context context = this.A0G;
            UserSession userSession = this.A0J;
            C39724A6p a6p = (C39724A6p) userSession.A01(C39724A6p.class, new MMW(30, context.getApplicationContext(), userSession));
            String A0I2 = 002.A0I("[AMG] #Suggestion found:", 10, list.size());
            0qQ.A0B(A0I2, 0);
            StringBuilder sb = a6p.A01;
            sb.append(A0I2);
            StringBuilder sb2 = new StringBuilder();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C381559bx r1 = (C381559bx) it.next();
                sb2.append("[AMG] ");
                sb2.append(r1.A02);
                sb2.append(" ");
                sb2.append(r1.A05.size());
                sb2.append("\n");
            }
            String obj = sb2.toString();
            0qQ.A07(obj);
            sb.append(obj);
            TextView textView = a6p.A00;
            if (textView != null) {
                textView.setText(sb.toString());
            }
            sb.setLength(0);
        }
        if ((!list.isEmpty()) && (this.A0K.A08.A00 instanceof AnonymousClass80O)) {
            C227382jA r0 = this.A0P;
            UserSession userSession2 = this.A0J;
            if (r0.A01(userSession2)) {
                list.size();
                C63144KsC.A00(userSession2, list);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.2jA] */
    public /* synthetic */ C362178hT(Context context, AnonymousClass4DH r6, AnonymousClass0iw r7, UserSession userSession, C357638Yz r9, AnonymousClass8HT r10, C362168hS r11, C2801950r r12, AnonymousClass8XW r13) {
        ? obj = new Object();
        this.A0G = context;
        this.A0H = r6;
        this.A0J = userSession;
        this.A0K = r9;
        this.A0I = r7;
        this.A0N = r11;
        this.A0M = r10;
        this.A0P = obj;
        this.A0O = r12;
        this.A0R = AnonymousClass0eN.A01(new C377429Lu(10, r13, this));
        this.A0L = C361578gS.A00(userSession);
        this.A07 = "";
        this.A0C = this.A0H.requireArguments().getString("META_GALLERY_ALBUM_TYPE") != null;
        this.A01 = AnonymousClass972.MUTABLE_FLAG_MASK;
        this.A0S = AnonymousClass0eN.A00(0eO.A02, new C377269Le(this, 5));
        this.A00 = (int) (System.currentTimeMillis() / 1000);
        this.A0F = 100;
        this.A03 = new AnonymousClass9I1();
    }

    private final void A00() {
        if (!this.A0D) {
            0wc r2 = 27p.A01(this.A0J).A01;
            0Aj A002 = r2.A00(r2.A00, "ig_wearable_empty_meta_view_album");
            if (A002.isSampled()) {
                A002.Cgf();
            }
        }
        this.A0D = true;
    }

    public static final void A01(C362178hT r6) {
        if (!r6.A0E) {
            int ordinal = r6.A03().A03.ordinal();
            if (ordinal == 524) {
                r6.A0E = true;
                UserSession userSession = r6.A0J;
                AnonymousClass9PQ.A08(r6.A0I, userSession, C273654mx.A00(846), AnonymousClass9PQ.A00((C279284yO) r6.A0K.A08.A00), 0se.A0M(new 0eP(AnonymousClass000.A00(3640), "album_load_successful")));
            } else if (ordinal == 509) {
                r6.A0E = true;
                AnonymousClass9PQ.A05(r6.A0I, r6.A0J, AnonymousClass05K.A0N);
            }
        }
    }

    private final void A02(Folder folder) {
        this.A07 = "";
        this.A0N.A0J.Epw((Object) null);
        this.A05 = null;
        int i = folder.A02;
        if (i == -5) {
            FFa.A03(A03().A0w.A0B, (File) null, 4921);
            return;
        }
        this.A0T = Integer.valueOf(new Random().nextInt());
        UserSession userSession = this.A0J;
        27p.A01(userSession).A0J.A02(this.A0O, "folder_selected");
        AnonymousClass0eM r3 = this.A0R;
        if (((AnonymousClass8XW) r3.getValue()).A02.A02 == i) {
            C362048hG A032 = A03();
            A032.A0m.A00 = new AnonymousClass9W1(A032);
        }
        this.A02 = 0;
        this.A00 = (int) (System.currentTimeMillis() / 1000);
        ((AnonymousClass8XW) r3.getValue()).A0D(i);
        if (i != -1 || !182.A06(0Tu.A05, userSession, 36316662907540027L)) {
            A03().A0f(0sn.A00, C41715Az6.A00, true);
        } else {
            C361588gT r6 = this.A0L;
            0qQ.A0B(r6, 0);
            A03().A0f(00k.A0a(((C361628gX) r6.A07.getValue()).A02), C41714Az5.A00, true);
            r6.A04(AnonymousClass9PQ.A00((C279284yO) this.A0K.A08.A00));
        }
        A03().A0a();
        C362048hG A033 = A03();
        String str = folder.A03;
        if (str == null) {
            str = "";
        }
        A033.A0d(str);
        if (((AnonymousClass8XW) r3.getValue()).A06().size() <= this.A0F) {
            A05();
        }
    }

    public final C362048hG A03() {
        C362048hG r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("delegate");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String A04() {
        if (!00l.A0W(this.A07)) {
            return this.A07;
        }
        String str = ((C362688iK) this.A0Q.getValue()).A03.A02.A03;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0157, code lost:
        if (r3 > 2) goto L_0x0159;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05() {
        /*
            r23 = this;
            r0 = r23
            int r2 = r0.A02
            int r1 = r0.A00
            if (r2 == r1) goto L_0x0115
            X.8hG r1 = r0.A03()
            boolean r1 = r1.A0C
            if (r1 == 0) goto L_0x0148
            X.0eM r1 = r0.A0R
            java.lang.Object r1 = r1.getValue()
            X.8XW r1 = (X.AnonymousClass8XW) r1
            com.instagram.ui.widget.mediapicker.Folder r1 = r1.A02
            int r2 = r1.A02
            r1 = -1
            if (r2 != r1) goto L_0x0143
            int r1 = r0.A0F
        L_0x0021:
            X.8hS r2 = r0.A0N
            X.0Ud r2 = r2.A0K
            java.lang.Object r3 = r2.getValue()
            java.lang.String r3 = (java.lang.String) r3
            int r2 = r0.A01
            if (r1 <= r2) goto L_0x0128
            boolean r2 = r0.A06()
            if (r2 != 0) goto L_0x0128
            r0.A01 = r1
            com.instagram.common.session.UserSession r8 = r0.A0J
            r2 = 0
            X.02m r5 = X.02m.A0p
            r4 = 17629202(0x10d0012, float:2.589766E-38)
            java.lang.String r3 = "load_media"
            r5.markerPoint(r4, r3)
            X.8Yz r3 = r0.A0K
            X.80m r5 = r3.A08
            java.lang.Object r3 = r5.A00
            boolean r3 = r3 instanceof X.AnonymousClass80O
            if (r3 == 0) goto L_0x0063
            X.27r r3 = X.27p.A01(r8)
            X.283 r6 = r3.A04
            X.29E r9 = r3.A00
            r12 = 838604704(0x31fc17a0, float:7.336851E-9)
            r13 = 15
            r10 = 0
            r11 = r10
            long r3 = r9.A04(r10, r11, r12, r13)
            r6.A04 = r3
        L_0x0063:
            int r6 = r0.A0F
            if (r1 != r6) goto L_0x00d8
            java.util.Random r3 = new java.util.Random
            r3.<init>()
            int r3 = r3.nextInt()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            r0.A06 = r11
            X.2Nl r4 = X.2Nk.A00(r8)
            java.lang.Object r5 = r5.A00
            X.4yO r5 = (X.C279284yO) r5
            X.8hG r3 = r0.A03()
            X.28D r7 = r3.A03
            X.27r r3 = X.27p.A01(r8)
            java.lang.String r21 = r3.A0R()
            if (r21 != 0) goto L_0x0090
            java.lang.String r21 = ""
        L_0x0090:
            r16 = 0
            X.0qQ.A0B(r5, r2)
            r2 = 1
            X.0qQ.A0B(r7, r2)
            com.instagram.common.session.UserSession r10 = r4.A05
            X.0Tu r9 = X.0Tu.A06
            r2 = 36601934634946939(0x8209440002117b, double:3.2105490750767876E-306)
            long r14 = X.182.A01(r9, r10, r2)
            r2 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 * r2
            X.29E r10 = r4.A04
            r12 = 0
            r13 = 17638606(0x10d24ce, float:2.5924016E-38)
            long r2 = r10.A04(r11, r12, r13, r14)
            r4.A01 = r2
            java.lang.String r5 = r5.A02
            java.lang.String r14 = "camera_destination"
            r11 = r10
            r12 = r2
            r15 = r5
            r11.A0B(r12, r14, r15, r16)
            long r2 = r4.A01
            java.lang.String r15 = r7.name()
            java.lang.String r14 = "entry_point"
            r12 = r2
            r11.A0B(r12, r14, r15, r16)
            long r2 = r4.A01
            java.lang.String r20 = "transport_type"
            r17 = r10
            r18 = r2
            r22 = r16
            r17.A0B(r18, r20, r21, r22)
        L_0x00d8:
            if (r1 != r6) goto L_0x0116
            X.0eM r4 = r0.A0R
            java.lang.Object r2 = r4.getValue()
            X.8XW r2 = (X.AnonymousClass8XW) r2
            int r3 = r0.A00
            X.8XZ r2 = r2.A08
            r2.A00 = r3
            r0.A02 = r3
        L_0x00ea:
            java.lang.Object r2 = r4.getValue()
            X.8XW r2 = (X.AnonymousClass8XW) r2
            r2.A0A(r1)
            if (r1 != r6) goto L_0x0115
            java.lang.Integer r1 = r0.A0T
            if (r1 != 0) goto L_0x0108
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            int r1 = r1.nextInt()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.A0T = r1
        L_0x0108:
            X.27r r1 = X.27p.A01(r8)
            X.29L r2 = r1.A0J
            X.50r r1 = r0.A0O
            java.lang.String r0 = "media_load_requested"
            r2.A01(r1, r0)
        L_0x0115:
            return
        L_0x0116:
            r2 = 0
            r0.A00 = r2
            X.0eM r4 = r0.A0R
            java.lang.Object r2 = r4.getValue()
            X.8XW r2 = (X.AnonymousClass8XW) r2
            int r3 = r0.A00
            X.8XZ r2 = r2.A08
            r2.A00 = r3
            goto L_0x00ea
        L_0x0128:
            boolean r1 = r0.A06()
            if (r1 == 0) goto L_0x0115
            if (r3 == 0) goto L_0x0115
            X.8gT r2 = r0.A0L
            X.8Yz r0 = r0.A0K
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            X.4yO r0 = (X.C279284yO) r0
            java.lang.String r1 = X.AnonymousClass9PQ.A00(r0)
            r0 = 0
            r2.A05(r3, r1, r0)
            return
        L_0x0143:
            r1 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0021
        L_0x0148:
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            java.lang.Integer r1 = X.C338977ir.A00()
            if (r1 == r2) goto L_0x0159
            int r3 = r1.intValue()
            r2 = 2
            r1 = 10
            if (r3 <= r2) goto L_0x0021
        L_0x0159:
            r1 = 50
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C362178hT.A05():void");
    }

    public final boolean A06() {
        if (this.A0N.A0K.getValue() != null) {
            return true;
        }
        return false;
    }

    public final boolean AFR(Folder folder, List list) {
        if (((Boolean) this.A0S.getValue()).booleanValue()) {
            return true;
        }
        if (A03().A00 > 0.0f && A03().A08 == AnonymousClass05K.A00 && ((C362688iK) this.A0Q.getValue()).A03.A02.A02 == -1) {
            return true;
        }
        return false;
    }

    public final List C2u(Integer num) {
        C390879rz r0;
        ArrayList arrayList = new ArrayList();
        if (num == AnonymousClass05K.A01) {
            r0 = C390879rz.AUTO_CREATED_REELS;
        } else {
            r0 = C390879rz.METADATA_ONLY;
        }
        arrayList.add(r0);
        if (((Boolean) this.A0S.getValue()).booleanValue()) {
            arrayList.add(C390879rz.SMART_ALBUMS);
        }
        JY0 A002 = JYB.A00(this.A0G, this.A0J, this.A0P);
        AnonymousClass9IE r2 = new AnonymousClass9IE((List) arrayList, 25);
        Fragment fragment = this.A0H;
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            AnonymousClass07a.A00(activity);
        } else {
            AnonymousClass07a.A00(fragment);
        }
        return A002.A00(r2);
    }
}
