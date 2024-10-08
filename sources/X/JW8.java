package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import com.instagram.android.R;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.ui.mediatabbar.Tab;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.ui.widget.mediapicker.Folder;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class JW8 {
    public static boolean A0X;
    public int A00 = ((int) AnonymousClass7TG.A0I());
    public LPH A01;
    public Tab A02;
    public Integer A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Context A09;
    public final GridLayoutManager A0A;
    public final C249403jg A0B;
    public final C249403jg A0C;
    public final AnonymousClass4DH A0D;
    public final UserSession A0E;
    public final JWM A0F;
    public final C361678gc A0G;
    public final C59750JWm A0H;
    public final C59748JWk A0I;
    public final C361588gT A0J;
    public final C3499682q A0K;
    public final C229402nK A0L;
    public final AnonymousClass4UR A0M;
    public final C361778gm A0N;
    public final AnonymousClass8XW A0O;
    public final C361558gQ A0P;
    public final ArrayList A0Q = AnonymousClass7TE.A1C();
    public final boolean A0R;
    public final boolean A0S;
    public final FragmentActivity A0T;
    public final 1UV A0U;
    public final JW6 A0V;
    public final 0sP A0W;

    private final void A05(boolean z) {
        int color;
        int A032;
        Context context = this.A09;
        if (z) {
            color = 1QE.A0B(context, (1QG) null).getDefaultColor();
        } else {
            color = context.getColor(R.color.grey_7_75_transparent);
        }
        SlideInAndOutIconView slideInAndOutIconView = this.A0I.A02.A04;
        slideInAndOutIconView.A02(color, color);
        if (z) {
            A032 = 1QE.A0C(context, (1QG) null).getDefaultColor();
        } else {
            A032 = AnonymousClass7TF.A03(context, R.attr.igds_color_icon_on_color);
        }
        slideInAndOutIconView.setTextColor(A032);
        slideInAndOutIconView.setIconColor(A032);
    }

    public static final boolean A09(JW8 jw8, C3499682q r4) {
        CreationSession creationSession = ((JWE) r4).A01;
        AnonymousClass36W r1 = creationSession.A0A;
        r1.getClass();
        if (r1 == AnonymousClass36W.PROFILE_PHOTO) {
            return true;
        }
        AnonymousClass36W r12 = creationSession.A0A;
        r12.getClass();
        if (r12 == AnonymousClass36W.REACT_MEDIA_PICKER) {
            return true;
        }
        AnonymousClass36W r13 = creationSession.A0A;
        r13.getClass();
        if (r13 == AnonymousClass36W.GROUP_PHOTO) {
            return true;
        }
        if (r4.CKG() && !AnonymousClass30D.A05(jw8.A0E)) {
            return true;
        }
        MediaCaptureConfig mediaCaptureConfig = creationSession.A09;
        if (mediaCaptureConfig == null || !mediaCaptureConfig.A07) {
            return false;
        }
        return true;
    }

    public final void A0J(C357268Xf r3) {
        0qQ.A0B(r3, 0);
        String name = r3.getName();
        IgTextView igTextView = this.A0I.A02.A03.A01;
        if (igTextView != null) {
            igTextView.setText(name);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c3 A[LOOP:0: B:30:0x00bd->B:32:0x00c3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x011e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0K(java.lang.Integer r21) {
        /*
            r20 = this;
            r5 = 1
            r6 = r20
            r1 = r21
            r6.A03 = r1
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r7 = 0
            boolean r12 = X.AnonymousClass7TF.A1W(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            boolean r10 = X.AnonymousClass7TF.A1W(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            boolean r8 = X.AnonymousClass7TF.A1W(r1, r0)
            X.JWk r0 = r6.A0I
            X.JWj r11 = r0.A02
            com.instagram.common.session.UserSession r3 = r6.A0E
            android.content.Context r9 = r6.A09
            X.0qQ.A0B(r11, r7)
            r0 = 2130970310(0x7f0406c6, float:1.7549327E38)
            if (r12 == 0) goto L_0x002d
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
        L_0x002d:
            int r2 = X.AnonymousClass7TF.A03(r9, r0)
            X.JWl r0 = r11.A03
            com.instagram.common.ui.base.IgTextView r1 = r0.A01
            if (r1 == 0) goto L_0x0142
            r1.setTextColor(r2)
            if (r12 == 0) goto L_0x0138
            int r0 = X.C51968G9o.A04(r9)
        L_0x0040:
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.setCompoundDrawableTintList(r0)
            com.instagram.common.ui.base.IgTextView r4 = r11.A00
            r4.setSelected(r10)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320425298370980(0x81093c000021a4, double:3.032521437079038E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x012e
            if (r10 == 0) goto L_0x0129
            r0 = 2130970334(0x7f0406de, float:1.7549375E38)
        L_0x005e:
            int r0 = X.2Yu.A0H(r9, r0)
        L_0x0062:
            X.DbT.A17(r9, r4, r0)
            com.instagram.common.ui.base.IgTextView r1 = r11.A01
            r1.setSelected(r8)
            r0 = 2130970310(0x7f0406c6, float:1.7549327E38)
            if (r8 == 0) goto L_0x0072
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
        L_0x0072:
            X.JTS.A0u(r9, r1, r0)
            if (r10 == 0) goto L_0x011e
            r0 = 36326537036838722(0x810ecb00003742, double:3.036386525096033E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            java.util.ArrayList r0 = X.JX7.A00(r3)
            if (r1 == 0) goto L_0x008a
            java.util.List r0 = X.00k.A0Y(r0)
        L_0x008a:
            X.JWM r4 = r6.A0F
            r4.A0A(r0, r5)
        L_0x008f:
            r9 = 0
            java.lang.String r2 = ""
            if (r12 == 0) goto L_0x0103
            X.8Xf r1 = r6.A0B()
            X.2Fk r0 = r4.A0K
            java.lang.Object r0 = r0.A02()
            if (r1 != r0) goto L_0x00ea
            A04(r6, r7)
            r6.A0E()
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r4.Ecr(r9, r2, r0)
        L_0x00ad:
            if (r8 == 0) goto L_0x00e5
            java.util.ArrayList r0 = r6.A0Q
        L_0x00b1:
            X.0qQ.A0B(r0, r7)
            java.util.List r3 = r4.A0V
            r3.clear()
            java.util.Iterator r2 = r0.iterator()
        L_0x00bd:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x013b
            java.lang.Object r1 = r2.next()
            X.8y3 r1 = (X.AnonymousClass8y3) r1
            X.0qQ.A0B(r1, r5)
            java.lang.Integer r17 = X.AnonymousClass05K.A0Y
            java.lang.String r0 = r1.A02
            r19 = -1
            com.instagram.common.gallery.model.GalleryItem r8 = new com.instagram.common.gallery.model.GalleryItem
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r1
            r14 = r9
            r15 = r9
            r16 = r9
            r18 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r3.add(r8)
            goto L_0x00bd
        L_0x00e5:
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            goto L_0x00b1
        L_0x00ea:
            X.8XW r0 = r6.A0O
            com.instagram.ui.widget.mediapicker.Folder r3 = r0.A02
            java.util.List r2 = r3.A01()
            java.lang.String r1 = r3.getName()
            int r0 = r3.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.Ecr(r0, r1, r2)
            r6.A0I(r3, r7)
            goto L_0x00ad
        L_0x0103:
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r4.Ecr(r9, r2, r0)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            X.JXO r0 = X.JXO.A00
            r4.A09(r2, r1, r0)
            r4.A09 = r7
            r4.A07()
            r4.A08 = r7
            r4.A07()
            goto L_0x00ad
        L_0x011e:
            X.JWM r4 = r6.A0F
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r4.A0A(r0, r7)
            goto L_0x008f
        L_0x0129:
            r0 = 2131100269(0x7f06026d, float:1.7812915E38)
            goto L_0x0062
        L_0x012e:
            r0 = 2130970310(0x7f0406c6, float:1.7549327E38)
            if (r10 == 0) goto L_0x005e
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
            goto L_0x005e
        L_0x0138:
            r0 = 0
            goto L_0x0040
        L_0x013b:
            r4.A07()
            r6.A0F()
            return
        L_0x0142:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JW8.A0K(java.lang.Integer):void");
    }

    public static final ArrayList A00(JW8 jw8) {
        ArrayList A042 = jw8.A0O.A04();
        1UV r4 = jw8.A0U;
        ArrayList arrayList = new ArrayList();
        Iterator it = A042.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (r4.apply(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0058, code lost:
        if (r1.A0W.indexOf(r8) <= -1) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0087, code lost:
        if (r14 == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00aa, code lost:
        if (r0.equals(r8) == false) goto L_0x00ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.instagram.common.gallery.model.GalleryItem r24, X.JW8 r25, boolean r26) {
        /*
            r8 = r24
            java.lang.Integer r6 = r8.A09
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            r7 = r25
            if (r6 != r2) goto L_0x0040
            X.LPH r1 = r7.A01
            if (r1 == 0) goto L_0x0013
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r1.A08(r2, r0)
        L_0x0013:
            android.content.Context r5 = r7.A09
            java.lang.String r2 = r8.A0A
            java.lang.String r1 = "GalleryPickerGridViewController"
            java.lang.String r0 = "GALLERY"
            X.Del r0 = X.C319116q4.A01(r5, r2, r1, r0)
            com.instagram.common.session.UserSession r4 = r7.A0E
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r2 = r0.A06()
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.Object r1 = X.0mE.A01(r5, r0)
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 629(0x275, float:8.81E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r0 = X.DbV.A0Y(r1, r2, r4, r3, r0)
            r0.A0C(r5)
        L_0x003c:
            r7.A0F()
        L_0x003f:
            return
        L_0x0040:
            boolean r0 = A06(r8, r7)
            if (r0 != 0) goto L_0x003f
            X.JWM r1 = r7.A0F
            boolean r5 = r1.A07
            boolean r0 = r8.A05()
            if (r0 == 0) goto L_0x005a
            java.util.List r0 = r1.A0W
            int r1 = r0.indexOf(r8)
            r0 = -1
            r15 = 1
            if (r1 > r0) goto L_0x005b
        L_0x005a:
            r15 = 0
        L_0x005b:
            X.JWm r0 = r7.A0H
            X.JW7 r4 = r0.A00
            X.JW8 r3 = r4.A14
            X.JWM r2 = r3.A0F
            int r0 = r2.A04(r8)
            long r12 = (long) r0
            com.instagram.common.gallery.Medium r1 = r8.A00
            if (r1 == 0) goto L_0x01dc
            int r0 = r1.A04
            long r9 = (long) r0
            int r0 = r1.A0B
            long r0 = (long) r0
        L_0x0072:
            boolean r25 = r8.A06()
            X.8Xf r11 = r3.A0B()
            java.lang.String r17 = r11.getName()
            com.instagram.common.gallery.model.GalleryItem r11 = r4.A0B
            if (r11 == 0) goto L_0x0089
            boolean r14 = r11.equals(r8)
            r11 = 1
            if (r14 != 0) goto L_0x008a
        L_0x0089:
            r11 = 0
        L_0x008a:
            if (r15 == 0) goto L_0x01c9
            if (r5 == 0) goto L_0x00a1
            if (r11 == 0) goto L_0x00a1
            com.instagram.common.session.UserSession r11 = r4.A0z
            X.27r r16 = X.27p.A01(r11)
            r18 = r0
            r20 = r9
            r22 = r12
            r24 = r25
            r16.A1u(r17, r18, r20, r22, r24)
        L_0x00a1:
            com.instagram.common.gallery.model.GalleryItem r0 = r4.A0B
            if (r0 == 0) goto L_0x00ac
            boolean r0 = r0.equals(r8)
            r11 = 1
            if (r0 != 0) goto L_0x00ad
        L_0x00ac:
            r11 = 0
        L_0x00ad:
            r9 = 1
            if (r5 == 0) goto L_0x01bd
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r6 != r0) goto L_0x00ba
            boolean r0 = r8.A01()
            if (r0 != 0) goto L_0x00e1
        L_0x00ba:
            if (r15 == 0) goto L_0x015f
            if (r11 != 0) goto L_0x00c0
            if (r26 == 0) goto L_0x015f
        L_0x00c0:
            r0 = 0
            r2.Ejh(r8, r0, r9)
            java.util.Set r1 = r4.A1K
            java.lang.String r0 = r8.A0A
            r1.add(r0)
        L_0x00cb:
            X.1Ng r6 = r4.A0y
            java.util.List r0 = r2.A0W
            java.util.List r0 = X.C51966G9m.A1J(r0)
            int r3 = r0.size()
            boolean r1 = r2.A07
            X.Jbx r0 = new X.Jbx
            r0.<init>(r3, r1)
            r6.A05(r0)
        L_0x00e1:
            X.JcD r1 = r4.A0D
            if (r1 == 0) goto L_0x00f4
            X.8QZ r0 = r1.A01
            X.7Gf r0 = r0.A0R
            boolean r0 = r0.isEmpty()
            if (r0 != r9) goto L_0x012f
            if (r15 != 0) goto L_0x012f
            X.JW7.A0G(r4)
        L_0x00f4:
            com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager r3 = r4.A0I
            if (r3 == 0) goto L_0x003c
            java.util.List r0 = r2.A0W
            java.util.List r2 = X.C51966G9m.A1J(r0)
            if (r15 == 0) goto L_0x0112
            if (r11 == 0) goto L_0x0112
            boolean r0 = X.AnonymousClass7TE.A1b(r2)
            if (r0 == 0) goto L_0x0112
            int r0 = X.DbT.A02(r2, r9)
            java.lang.Object r8 = r2.get(r0)
            com.instagram.common.gallery.model.GalleryItem r8 = (com.instagram.common.gallery.model.GalleryItem) r8
        L_0x0112:
            java.util.List r0 = r3.A02
            boolean r1 = r0.isEmpty()
            com.instagram.common.session.UserSession r0 = r4.A0z
            r3.setGalleryItems(r2, r8, r0)
            if (r1 == 0) goto L_0x0128
            boolean r0 = X.AnonymousClass7TE.A1b(r2)
            if (r0 == 0) goto L_0x0128
            X.JW7.A0H(r4)
        L_0x0128:
            if (r5 == 0) goto L_0x003c
            X.JW7.A0L(r4, r9)
            goto L_0x003c
        L_0x012f:
            X.8QZ r6 = r1.A01
            if (r15 == 0) goto L_0x0139
            X.7Gf r0 = r6.A0R
            r0.EDm(r8)
            goto L_0x00f4
        L_0x0139:
            boolean r0 = r8.A02()
            r3 = 0
            if (r0 == 0) goto L_0x0153
            com.instagram.common.gallery.Medium r0 = r8.A00
            if (r0 == 0) goto L_0x00f4
            com.instagram.common.gallery.model.GalleryItem$LocalGalleryMedium r0 = X.JTR.A0f(r0)
            X.9SZ r1 = new X.9SZ
            r1.<init>(r0, r3)
        L_0x014d:
            X.7Gf r0 = r6.A0R
            r0.A8m(r1)
            goto L_0x00f4
        L_0x0153:
            boolean r0 = r8.A04()
            if (r0 == 0) goto L_0x00f4
            X.9SZ r1 = new X.9SZ
            r1.<init>(r8, r3)
            goto L_0x014d
        L_0x015f:
            com.instagram.creation.base.CreationSession r10 = X.JWE.A00(r4)
            java.lang.String r0 = r10.A0C
            if (r0 == 0) goto L_0x01ac
            android.content.Context r6 = r4.getContext()
            java.lang.Class<X.4cI> r0 = X.C267834cI.class
            java.lang.Object r1 = X.0mE.A00(r6, r0)
            X.4cI r1 = (X.C267834cI) r1
            if (r1 == 0) goto L_0x01aa
            java.lang.String r0 = r10.A0C
            X.3Q2 r1 = r1.BbQ(r0)
        L_0x017b:
            boolean r0 = r8.A06()
            if (r0 == 0) goto L_0x01ac
            if (r1 == 0) goto L_0x01ac
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r1.A1J
            if (r0 == 0) goto L_0x01ac
            com.instagram.common.session.UserSession r0 = r4.A0z
            boolean r0 = X.AnonymousClass30D.A05(r0)
            if (r0 != 0) goto L_0x01ac
            r0 = 0
            X.LUV r3 = new X.LUV
            r3.<init>(r0, r1, r4, r8)
            java.lang.Class<X.4mi> r0 = X.C273514mi.class
            java.lang.Object r0 = X.0mE.A01(r6, r0)
            X.4mj r0 = (X.C273524mj) r0
            com.instagram.creation.activity.MediaCaptureActivity r0 = (com.instagram.creation.activity.MediaCaptureActivity) r0
            X.JWG r1 = r0.A07
            if (r1 == 0) goto L_0x01e2
            java.lang.Integer r0 = X.AnonymousClass05K.A06
            r1.A0A(r3, r0)
            goto L_0x00cb
        L_0x01aa:
            r1 = 0
            goto L_0x017b
        L_0x01ac:
            r2.Ejh(r8, r9, r9)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r3.A0H(r8, r0)
            java.util.Set r1 = r4.A1K
            java.lang.String r0 = r8.A0A
            r1.remove(r0)
            goto L_0x00cb
        L_0x01bd:
            if (r15 != 0) goto L_0x00f4
            r2.Ejh(r8, r9, r9)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r3.A0H(r8, r0)
            goto L_0x00f4
        L_0x01c9:
            com.instagram.common.session.UserSession r11 = r4.A0z
            X.27r r16 = X.27p.A01(r11)
            java.lang.String r18 = "TAP"
            r21 = r9
            r23 = r12
            r19 = r0
            r16.A1v(r17, r18, r19, r21, r23, r25)
            goto L_0x00a1
        L_0x01dc:
            r9 = 0
            r0 = 0
            goto L_0x0072
        L_0x01e2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JW8.A01(com.instagram.common.gallery.model.GalleryItem, X.JW8, boolean):void");
    }

    public static final void A02(JW8 jw8) {
        L0C l0c = jw8.A0H.A00.A15;
        C339797kB r0 = l0c.A00;
        if (r0 != null) {
            r0.A00();
        }
        l0c.A00 = null;
        jw8.A0G(-1);
    }

    public static final void A03(JW8 jw8) {
        if (0qQ.A0K(jw8.A02, JXL.A00) && jw8.A03 == AnonymousClass05K.A00 && A07(jw8)) {
            jw8.A0F.A09(jw8.A0B().getName(), JTS.A0q(jw8.A0J.A00), jw8.A0W);
        }
    }

    public static final void A04(JW8 jw8, boolean z) {
        if (0qQ.A0K(jw8.A02, JXL.A00) && jw8.A03 == AnonymousClass05K.A00) {
            C357268Xf A0B2 = jw8.A0B();
            JWM jwm = jw8.A0F;
            if (A0B2 == jwm.A0K.A02()) {
                if (JTS.A1Y(jw8.A0E)) {
                    jwm.A09 = true;
                    jwm.A07();
                }
                jwm.A09(jw8.A0B().getName(), JTS.A0q(jwm.A0M), jw8.A0W);
                if (z && jwm.A06() != null) {
                    jw8.A04 = true;
                    jwm.Ejh(jwm.A06(), true, false);
                    jw8.A04 = false;
                }
            }
        }
    }

    public static final boolean A06(GalleryItem galleryItem, JW8 jw8) {
        UserSession userSession = jw8.A0E;
        boolean A042 = galleryItem.A04();
        boolean A062 = galleryItem.A06();
        int A002 = C64153LQs.A00(galleryItem);
        if (!A042 || !A062 || !AJ5.A06(userSession, A002)) {
            return false;
        }
        AnonymousClass4DH r3 = jw8.A0D;
        AnonymousClass7TG.A1N(userSession, r3);
        AnonymousClass9PQ.A08(r3, userSession, AnonymousClass000.A00(1489), "posts", (Map) null);
        F5K.A00(r3.getActivity(), userSession);
        return true;
    }

    public static final boolean A08(JW8 jw8) {
        if (A0X || C2604245p.A02(C61270mF.A00(jw8.A09))) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ae, code lost:
        if (r0 != 0) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b1, code lost:
        if (r0 != 0) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b3, code lost:
        r6 = r5 + r4;
        r0 = r0 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b8, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ba, code lost:
        if (r8 != false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bc, code lost:
        r6 = (r5 + r4) * 2;
        r0 = r0 - 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c1, code lost:
        r6 = r6 + (r0 * r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0A() {
        /*
            r11 = this;
            androidx.recyclerview.widget.GridLayoutManager r9 = r11.A0A
            int r7 = r9.A1a()
            android.view.View r10 = r9.A1D(r7)
            if (r10 == 0) goto L_0x00c4
            X.8gc r1 = r11.A0G
            X.JWM r0 = r11.A0F
            java.util.List r0 = r0.A0S
            boolean r8 = X.AnonymousClass7TE.A1b(r0)
            int r5 = r11.A07
            int r2 = r11.A08
            int r4 = r11.A06
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.3kE r0 = androidx.recyclerview.widget.RecyclerView.A06(r10)
            int r3 = r0.mItemViewType
            boolean r0 = r1 instanceof X.JWL
            if (r0 == 0) goto L_0x0096
            X.JWL r1 = (X.JWL) r1
            X.2t9 r1 = r1.A07
            X.6sz r6 = r9.A01
            int r0 = r9.A00
            int r7 = r6.A02(r7, r0)
            int r2 = r2 + r4
            java.lang.Class<X.JWp> r0 = X.JWp.class
            int r0 = r1.A01(r0)
            r6 = 0
            if (r3 == r0) goto L_0x008e
            java.lang.Class<X.Lha> r0 = X.C64758Lha.class
            int r0 = r1.A01(r0)
            if (r3 == r0) goto L_0x008e
            java.lang.Class<X.LiE> r0 = X.C64794LiE.class
            int r0 = r1.A01(r0)
            if (r3 == r0) goto L_0x008e
            java.lang.Class<X.8gh> r0 = X.C361728gh.class
            int r0 = r1.A01(r0)
            if (r3 == r0) goto L_0x008e
            java.lang.Class<X.8gg> r0 = X.C361718gg.class
            int r0 = r1.A01(r0)
            if (r3 == r0) goto L_0x008e
            java.lang.Class<X.LiD> r0 = X.C64793LiD.class
            int r0 = r1.A01(r0)
            if (r3 == r0) goto L_0x0089
            java.lang.Class<X.LhZ> r0 = X.C64757LhZ.class
            int r0 = r1.A01(r0)
            if (r3 != r0) goto L_0x007b
            if (r7 != 0) goto L_0x0089
            r7 = 0
        L_0x0073:
            int r7 = r7 * r2
            int r6 = r6 + r7
        L_0x0075:
            int r0 = r10.getTop()
            int r6 = r6 - r0
            return r6
        L_0x007b:
            java.lang.Class<X.LiF> r0 = X.C64795LiF.class
            int r0 = r1.A01(r0)
            if (r3 == r0) goto L_0x0073
            java.lang.Class<X.Lhb> r0 = X.C64759Lhb.class
            r1.A01(r0)
            goto L_0x0073
        L_0x0089:
            int r6 = r5 + r4
            int r7 = r7 + -1
            goto L_0x0073
        L_0x008e:
            if (r8 == 0) goto L_0x0073
            int r5 = r5 + r4
            int r6 = r5 * 2
            int r7 = r7 + -2
            goto L_0x0073
        L_0x0096:
            X.6sz r1 = r9.A01
            int r0 = r9.A00
            int r0 = r1.A02(r7, r0)
            int r2 = r2 + r4
            r6 = 0
            switch(r3) {
                case 0: goto L_0x00ba;
                case 1: goto L_0x00b3;
                case 2: goto L_0x00b1;
                case 3: goto L_0x00ae;
                case 4: goto L_0x00c1;
                case 5: goto L_0x00ba;
                case 6: goto L_0x00ba;
                case 7: goto L_0x00ba;
                case 8: goto L_0x00c1;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            r0 = 972(0x3cc, float:1.362E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x00ae:
            if (r0 == 0) goto L_0x00b8
            goto L_0x00bc
        L_0x00b1:
            if (r0 == 0) goto L_0x00b8
        L_0x00b3:
            int r6 = r5 + r4
            int r0 = r0 + -1
            goto L_0x00c1
        L_0x00b8:
            r0 = 0
            goto L_0x00c1
        L_0x00ba:
            if (r8 == 0) goto L_0x00c1
        L_0x00bc:
            int r5 = r5 + r4
            int r6 = r5 * 2
            int r0 = r0 + -2
        L_0x00c1:
            int r0 = r0 * r2
            int r6 = r6 + r0
            goto L_0x0075
        L_0x00c4:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JW8.A0A():int");
    }

    public final C357268Xf A0B() {
        C357268Xf r0 = (C65796Lzo) this.A0F.A0K.A02();
        if (r0 == null) {
            r0 = this.A0O.A02;
        }
        return r0;
    }

    public final void A0C() {
        C232822uV r0;
        if (!this.A05 && A0M() && !this.A0S && this.A0G.getItemCount() > 0) {
            this.A05 = true;
            SlideInAndOutIconView slideInAndOutIconView = this.A0I.A02.A04;
            slideInAndOutIconView.setVisibility(0);
            AnonymousClass4UR r2 = this.A0M;
            WeakReference A0v = C51965G9l.A0v(slideInAndOutIconView);
            Set set = r2.A07;
            set.clear();
            set.add(A0v);
            Context context = this.A09;
            slideInAndOutIconView.setIcon(context.getDrawable(R.drawable.instagram_carousel_pano_outline_16));
            slideInAndOutIconView.setIconColor(context.getColor(2Yu.A05(context)));
            String A16 = AnonymousClass7TE.A16(context, 2131967724);
            slideInAndOutIconView.setText(A16);
            2eS.A04(slideInAndOutIconView, AnonymousClass05K.A06);
            slideInAndOutIconView.setContentDescription(A16);
            slideInAndOutIconView.A03 = C242233Td.END;
            slideInAndOutIconView.setAccessibilityDelegate(new U32(this, 0));
            JWM jwm = this.A0F;
            A05(jwm.A07);
            LY0.A00(slideInAndOutIconView, 22, this);
            if (jwm.A07 || AnonymousClass0xl.A00(C61170le.A00).A00.getInt("sidecar_button_nux_clicks", 0) >= 3) {
                r0 = C232822uV.A04;
            } else {
                r0 = C232822uV.A05;
            }
            r2.A02(r0);
        }
        A0F();
    }

    public final void A0D() {
        Tab tab = this.A02;
        if (((tab != null && tab.equals(JXL.A00)) || this.A0S) && !A08(this)) {
            if (C2604245p.A03(this.A09)) {
                A02(this);
            } else if (!A08(this)) {
                C2604245p.A01(this.A0T, new C64727Lh4(this, 2));
            }
        }
    }

    public final void A0E() {
        JWM jwm = this.A0F;
        boolean z = true;
        if (!AnonymousClass7TF.A1Y(jwm.A0L.A02(), true)) {
            z = false;
        }
        jwm.A08 = z;
        jwm.A07();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        if (r3.A14.A03 != r1) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F() {
        /*
            r6 = this;
            X.JWk r0 = r6.A0I
            X.JWj r5 = r0.A02
            boolean r0 = r6.A0S
            r4 = 0
            if (r0 != 0) goto L_0x0065
            com.instagram.common.ui.base.IgTextView r0 = r5.A00
            boolean r0 = r0.isSelected()
            if (r0 != 0) goto L_0x0065
            com.instagram.common.ui.base.IgTextView r0 = r5.A01
            boolean r0 = r0.isSelected()
            if (r0 != 0) goto L_0x0065
            boolean r0 = r6.A0M()
            if (r0 == 0) goto L_0x0065
            X.JWm r0 = r6.A0H
            X.JW7 r3 = r0.A00
            com.instagram.common.gallery.model.GalleryItem r2 = r3.A0B
            if (r2 == 0) goto L_0x0050
            boolean r0 = r2.A01()
            if (r0 != 0) goto L_0x003f
            java.lang.Integer r1 = r2.A09
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 == r0) goto L_0x003f
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0050
            com.instagram.common.gallery.Draft r0 = r2.A02
            if (r0 == 0) goto L_0x0050
            boolean r0 = r0.A08
            if (r0 != 0) goto L_0x0050
        L_0x003f:
            com.instagram.common.gallery.model.GalleryItem r0 = r3.A0B
            X.0qQ.A0A(r0)
            java.lang.Integer r0 = r0.A09
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r0 != r1) goto L_0x0065
            X.JW8 r0 = r3.A14
            java.lang.Integer r0 = r0.A03
            if (r0 == r1) goto L_0x0065
        L_0x0050:
            com.instagram.common.session.UserSession r3 = r6.A0E
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319493290663362(0x81086300031dc2, double:3.0319320316518463E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0065
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r0 = r5.A04
            r0.setVisibility(r4)
            return
        L_0x0065:
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r1 = r5.A04
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JW8.A0F():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r5 != -1) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G(int r5) {
        /*
            r4 = this;
            X.8XW r3 = r4.A0O
            r2 = -1
            if (r5 != r2) goto L_0x001a
            int r1 = r4.A00
        L_0x0007:
            X.8XZ r0 = r3.A08
            r0.A00 = r1
            boolean r0 = r4.A0R
            if (r0 == 0) goto L_0x0013
            r0 = 100
            if (r5 == r2) goto L_0x0016
        L_0x0013:
            r0 = 2147483647(0x7fffffff, float:NaN)
        L_0x0016:
            r3.A0A(r0)
            return
        L_0x001a:
            r1 = 0
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JW8.A0G(int):void");
    }

    public final void A0H(GalleryItem galleryItem, Integer num) {
        RemoteMedia remoteMedia = galleryItem.A04;
        if (remoteMedia != null) {
            UserSession userSession = this.A0E;
            AnonymousClass4DH r2 = this.A0D;
            JWM jwm = this.A0F;
            AnonymousClass9PQ.A02(r2, remoteMedia, userSession, num, "posts", C51966G9m.A1J(jwm.A0W), jwm.A07);
        }
    }

    public final void A0I(Folder folder, boolean z) {
        JWM jwm = this.A0F;
        jwm.A08((C65796Lzo) null);
        if (A07(this)) {
            if (AnonymousClass7TF.A0R(0Tu.A05, this.A0E, 36316662907540027L).booleanValue()) {
                A03(this);
                if (folder != null && !z) {
                    List A012 = folder.A01();
                    jwm.Ecr(Integer.valueOf(folder.A02), folder.getName(), A012);
                    return;
                }
            }
        }
        jwm.A09("", AnonymousClass7TE.A1C(), JXO.A00);
        if (folder != null) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c7, code lost:
        if (r12 != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01ec, code lost:
        if ((!X.JWE.A00(r4).A0L) == false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x027b, code lost:
        if (r8.A0P.A00.A02 == X.AnonymousClass05K.A0N) goto L_0x027d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x00ca A[EDGE_INSN: B:118:0x00ca->B:21:0x00ca ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00be A[LOOP:0: B:17:0x00b6->B:19:0x00be, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x025e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0L(boolean r12, boolean r13) {
        /*
            r11 = this;
            com.instagram.common.session.UserSession r0 = r11.A0E
            X.JbO r1 = X.JZM.A00(r0)
            com.instagram.common.session.UserSession r0 = r1.A05
            X.27r r0 = X.27p.A01(r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r12)
            X.28D r4 = r1.A00
            java.lang.String r3 = X.C59899JbO.A03(r1)
            X.29R r2 = r0.A09
            r5 = 1
            X.0qQ.A0B(r4, r5)
            X.1Ln r1 = X.JTO.A0N(r2)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = "IG_FEED_GALLERY_SELECT_MULTIPLE"
            r1.A0t(r0)
            java.lang.String r0 = "GALLERY_MULTI_SELECT_BUTTON"
            r1.A0r(r0)
            X.29R.A00(r1, r2)
            r1.A0b(r4)
            X.4yP r0 = r2.A0J()
            r1.A0a(r0)
            r1.A0T()
            X.JTO.A1U(r1, r3)
            X.JTQ.A1A(r1)
            java.lang.String r0 = "select_multiple_enabled"
            r1.A0O(r0, r6)
            X.JTS.A1E(r1)
        L_0x004e:
            X.4UR r2 = r11.A0M
            X.4Ki r1 = r2.A05
            X.4Ki r0 = X.AnonymousClass4Ki.FULLTEXT
            if (r1 != r0) goto L_0x00c7
            if (r12 == 0) goto L_0x00b2
            X.0wX r0 = X.C61170le.A00
            X.0xm r0 = X.AnonymousClass0xl.A00(r0)
            X.0xa r1 = r0.A00
            java.lang.String r0 = "sidecar_button_nux_clicks"
            X.0xY r0 = X.AnonymousClass7TG.A0g(r1, r0)
            r0.apply()
            X.2uV r0 = X.C232822uV.A06
            r2.A02(r0)
        L_0x006e:
            X.JWm r0 = r11.A0H
            X.JW7 r4 = r0.A00
            com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager r0 = r4.A0I
            if (r0 != 0) goto L_0x00b2
            boolean r0 = r4.A1L
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r4.A0d()
            if (r0 != 0) goto L_0x00b2
            com.instagram.common.session.UserSession r3 = r4.A0z
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318625707071817(0x81079900001949, double:3.0313833682950746E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00b2
            r0 = 2131429701(0x7f0b0945, float:1.8481082E38)
            android.view.View r1 = X.JTS.A0C(r4, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager"
            X.0qQ.A0C(r1, r0)
            com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager r1 = (com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager) r1
            r4.A0I = r1
            X.0qQ.A0A(r1)
            X.L9a r0 = r1.A04
            r0.A04 = r5
            com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager r1 = r4.A0I
            X.0qQ.A0A(r1)
            X.LlH r0 = new X.LlH
            r0.<init>(r4)
            r1.A00 = r0
        L_0x00b2:
            X.JWM r4 = r11.A0F
            r4.A07 = r12
        L_0x00b6:
            java.util.List r3 = r4.A0W
            int r0 = r3.size()
            if (r0 <= r5) goto L_0x00ca
            int r0 = r3.size()
            int r0 = r0 - r5
            r3.remove(r0)
            goto L_0x00b6
        L_0x00c7:
            if (r12 == 0) goto L_0x00b2
            goto L_0x006e
        L_0x00ca:
            boolean r0 = X.AnonymousClass7TE.A1b(r3)
            if (r0 == 0) goto L_0x0105
            java.lang.Object r2 = X.00k.A0I(r3)
            com.instagram.common.gallery.model.GalleryItem r2 = (com.instagram.common.gallery.model.GalleryItem) r2
            java.lang.Integer r1 = r2.A09
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0105
            com.instagram.common.gallery.Draft r0 = r2.A02
            if (r0 == 0) goto L_0x0105
            boolean r0 = r0.A08
            if (r0 != 0) goto L_0x0105
            r3.clear()
            java.util.List r0 = r4.A0S
            java.util.Iterator r2 = r0.iterator()
        L_0x00ed:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0105
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.instagram.common.gallery.model.GalleryItem r0 = (com.instagram.common.gallery.model.GalleryItem) r0
            boolean r0 = X.JWM.A03(r0, r12)
            if (r0 == 0) goto L_0x00ed
            if (r1 == 0) goto L_0x0105
            r3.add(r1)
        L_0x0105:
            X.JWM.A02(r4)
            r4.A07()
            if (r12 == 0) goto L_0x01b9
            com.instagram.common.session.UserSession r3 = r4.A0O
            X.0Tu r2 = X.0Tu.A05
            r0 = 36610086482745314(0x8210ae000017e2, double:3.215704336449336E-306)
            int r8 = X.DbS.A04(r2, r3, r0)
            r0 = 10
            if (r8 <= r0) goto L_0x01b9
            r0 = 36328611506175443(0x8110ae00023dd3, double:3.037698427857793E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x01b9
            android.content.Context r1 = r4.A0J
            X.1Av r2 = X.1Au.A00(r3)
            X.0s0 r0 = r2.A2X
            X.0YZ[] r7 = X.1Av.A8a
            r6 = 340(0x154, float:4.76E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r2, r0, r7, r6)
            if (r0 != 0) goto L_0x01b9
            boolean r0 = X.JWB.A01(r3)
            if (r0 == 0) goto L_0x0301
            android.content.Context r0 = X.2Yn.A01(r1)
        L_0x0145:
            X.8ab r4 = X.DbS.A0Y(r0)
            r0 = 2131237688(0x7f081b38, float:1.8091634E38)
            X.DbU.A16(r1, r4, r0)
            r0 = 2131954804(0x7f130c74, float:1.9546118E38)
            r4.A09(r0)
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131954803(0x7f130c73, float:1.9546116E38)
            java.lang.String r0 = java.lang.String.valueOf(r8)
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r2, r0, r1)
            r4.A0q(r0)
            X.Dba.A1L(r4)
            X.1Av r1 = X.1Au.A00(r3)
            X.0s0 r0 = r1.A2X
            X.AnonymousClass7TF.A1J(r1, r0, r7, r6, r5)
            X.27r r2 = X.27p.A01(r3)
            X.0wc r1 = r2.A01
            java.lang.String r0 = "ig_camera_notification_impression"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x01b9
            X.4yP r3 = r2.A0J()
            X.283 r2 = r2.A04
            java.lang.String r1 = r2.A0L
            if (r3 == 0) goto L_0x01b9
            if (r1 == 0) goto L_0x01b9
            java.lang.String r0 = "camera_destination"
            r4.A8M(r3, r0)
            X.JTO.A1S(r4, r1)
            r1 = 49
            java.lang.String r0 = "entity_type"
            X.AnonymousClass7TE.A1W(r4, r0, r1)
            X.AnonymousClass7TH.A0U(r4)
            X.JVj r0 = X.C59725JVj.GALLERY
            X.C51965G9l.A1A(r0, r4)
            X.28t r1 = r2.A0A
            java.lang.String r0 = "composition_media_type"
            r4.A8M(r1, r0)
            java.lang.String r1 = r2.A0M
            java.lang.String r0 = "composition_str_id"
            r4.AAJ(r0, r1)
            X.AnonymousClass7TH.A0V(r4)
        L_0x01b9:
            r11.A05(r12)
            X.8Xf r0 = r11.A0B()
            r11.A0J(r0)
            X.JWm r0 = r11.A0H
            X.JW7 r4 = r0.A00
            com.instagram.creation.capture.gallery.ui.CropTypeToggleButton r1 = r4.A13
            boolean r0 = X.JW7.A0P(r4)
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            X.JW8 r3 = r4.A14
            X.8Xf r0 = r3.A0B()
            r3.A0J(r0)
            boolean r9 = r4.A1P
            r10 = 1
            r7 = 0
            if (r9 != 0) goto L_0x01ee
            com.instagram.creation.base.CreationSession r0 = X.JWE.A00(r4)
            boolean r0 = r0.A0L
            r0 = r0 ^ 1
            r6 = 1
            if (r0 != 0) goto L_0x01ef
        L_0x01ee:
            r6 = 0
        L_0x01ef:
            com.instagram.common.session.UserSession r2 = r4.A0z
            X.0Tu r8 = X.0Tu.A05
            r0 = 36324574236782756(0x810d02000030a4, double:3.035145242437079E-306)
            boolean r0 = X.182.A06(r8, r2, r0)
            if (r0 == 0) goto L_0x022c
            X.B0f r0 = r4.A0F
            if (r0 == 0) goto L_0x022c
            r0 = 36319493290663362(0x81086300031dc2, double:3.0319320316518463E-306)
            boolean r0 = X.182.A06(r8, r2, r0)
            if (r0 != 0) goto L_0x022c
            X.B0f r0 = r4.A0F
            X.0qQ.A0A(r0)
            X.9Q3 r0 = (X.AnonymousClass9Q3) r0
            X.85W r0 = r0.A00
            X.80R r0 = r0.A01
            X.85X r0 = r0.A0n
            r0.A0C = r12
            com.instagram.creation.capture.quickcapture.cameradestinationpicker.ui.LegacyCameraDestinationScrollView r1 = r0.A0U
            r0 = r12 ^ 1
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            if (r6 == 0) goto L_0x02fe
            if (r12 != 0) goto L_0x02fe
        L_0x022b:
            r6 = r10
        L_0x022c:
            X.JW7.A0L(r4, r12)
            X.JWk r0 = r3.A0I
            X.JWj r8 = r0.A02
            com.instagram.common.ui.base.IgTextView r1 = r8.A00
            if (r9 != 0) goto L_0x02fa
            X.82q r0 = r4.A19
            boolean r0 = r0.CKG()
            if (r0 != 0) goto L_0x02fa
            com.instagram.common.session.UserSession r0 = r3.A0E
            java.util.ArrayList r0 = X.JX7.A00(r0)
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x02fa
        L_0x024b:
            r1.setVisibility(r7)
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r0 = r8.A02
            r0.setEnabled(r6)
            if (r12 != 0) goto L_0x025a
            java.util.Map r0 = r4.A1J
            r0.clear()
        L_0x025a:
            com.instagram.common.gallery.model.GalleryItem r9 = r4.A0B
            if (r9 == 0) goto L_0x028e
            X.JWM r8 = r3.A0F
            boolean r0 = r8.A0A
            if (r0 != 0) goto L_0x027d
            java.util.List r1 = r8.A0S
            r0 = 0
            X.0qQ.A0B(r1, r0)
            int r1 = r1.indexOf(r9)
            int r0 = r8.A0G
            if (r1 < r0) goto L_0x027d
            X.JWT r0 = r8.A0P
            X.JWF r0 = r0.A00
            java.lang.Object r6 = r0.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            r0 = 1
            if (r6 != r1) goto L_0x027e
        L_0x027d:
            r0 = 0
        L_0x027e:
            r7 = 0
            if (r0 == 0) goto L_0x02ba
            java.util.List r0 = r8.A0T
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.common.gallery.model.GalleryItem r0 = (com.instagram.common.gallery.model.GalleryItem) r0
            if (r0 == 0) goto L_0x028e
            r4.DQg(r0, r7)
        L_0x028e:
            X.JW7.A0J(r4)
            com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager r6 = r4.A0I
            if (r6 == 0) goto L_0x02a6
            if (r12 == 0) goto L_0x02a6
            X.JWM r0 = r3.A0F
            java.util.List r0 = r0.A0W
            java.util.List r1 = X.C51966G9m.A1J(r0)
            r0 = 0
            r6.setGalleryItems(r1, r0, r2)
            X.JW7.A0H(r4)
        L_0x02a6:
            X.6SR r0 = X.AnonymousClass6SR.A01()
            r0.A0J = r5
            X.1Ng r1 = r4.A0y
            X.Jbx r0 = new X.Jbx
            r0.<init>(r5, r12)
            r1.A05(r0)
            X.JW7.A0G(r4)
            return
        L_0x02ba:
            boolean r0 = X.JWM.A03(r9, r12)
            if (r0 != 0) goto L_0x02e6
            java.util.List r0 = r8.A0S
            java.util.Iterator r6 = r0.iterator()
        L_0x02c6:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x02e4
            java.lang.Object r1 = r6.next()
            r0 = r1
            com.instagram.common.gallery.model.GalleryItem r0 = (com.instagram.common.gallery.model.GalleryItem) r0
            boolean r0 = X.JWM.A03(r0, r12)
            if (r0 == 0) goto L_0x02c6
        L_0x02d9:
            com.instagram.common.gallery.model.GalleryItem r1 = (com.instagram.common.gallery.model.GalleryItem) r1
            if (r1 == 0) goto L_0x028e
            r4.DQg(r1, r7)
            r8.Ejh(r1, r5, r5)
            goto L_0x028e
        L_0x02e4:
            r1 = 0
            goto L_0x02d9
        L_0x02e6:
            if (r12 != 0) goto L_0x02f6
            boolean r0 = r9.A06()
            if (r0 == 0) goto L_0x02f6
            com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager r0 = r4.A0I
            if (r0 == 0) goto L_0x02f6
            X.JW7.A09(r9, r4, r7, r5)
            goto L_0x028e
        L_0x02f6:
            r8.Ejh(r9, r5, r13)
            goto L_0x028e
        L_0x02fa:
            r7 = 8
            goto L_0x024b
        L_0x02fe:
            r10 = 0
            goto L_0x022b
        L_0x0301:
            r0 = r1
            goto L_0x0145
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JW8.A0L(boolean, boolean):void");
    }

    public final boolean A0M() {
        C3499682q r1 = this.A0K;
        if (r1.CKG()) {
            return AnonymousClass30D.A04(this.A0E);
        }
        CreationSession creationSession = ((JWE) r1).A01;
        AnonymousClass36W r12 = creationSession.A0A;
        r12.getClass();
        if (r12 == AnonymousClass36W.PROFILE_PHOTO) {
            return false;
        }
        AnonymousClass36W r13 = creationSession.A0A;
        r13.getClass();
        if (r13 == AnonymousClass36W.REACT_MEDIA_PICKER) {
            return false;
        }
        AnonymousClass36W r14 = creationSession.A0A;
        r14.getClass();
        if (r14 == AnonymousClass36W.GROUP_PHOTO) {
            return false;
        }
        return true;
    }

    public static final boolean A07(JW8 jw8) {
        C357268Xf A0B2 = jw8.A0B();
        if (A0B2.CAp() == AnonymousClass05K.A00 && A0B2.BEU() == -1) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, X.4DH] */
    /* JADX WARNING: type inference failed for: r0v23, types: [java.lang.Object, X.2jE] */
    /* JADX WARNING: type inference failed for: r12v6, types: [java.lang.Object, X.2jA] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public JW8(android.content.Context r35, androidx.fragment.app.FragmentActivity r36, X.AnonymousClass4DH r37, com.instagram.common.session.UserSession r38, X.C59743JWb r39, X.C59750JWm r40, X.C59748JWk r41, X.C3499682q r42, X.MUO r43, X.C361558gQ r44, java.lang.Integer r45, int r46, boolean r47, boolean r48, boolean r49) {
        /*
            r34 = this;
            r13 = r36
            boolean r9 = X.DbW.A1Y(r13)
            r19 = 4
            r0 = 5
            r1 = r44
            X.0qQ.A0B(r1, r0)
            r6 = r34
            r6.<init>()
            r4 = r38
            r6.A0E = r4
            r6.A0T = r13
            r5 = r37
            r6.A0D = r5
            r27 = r42
            r0 = r27
            r6.A0K = r0
            r6.A0P = r1
            r14 = r35
            r6.A09 = r14
            r32 = r41
            r0 = r32
            r6.A0I = r0
            r33 = r40
            r0 = r33
            r6.A0H = r0
            r16 = r47
            r0 = r16
            r6.A0S = r0
            r7 = r49
            r6.A0R = r7
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            r6.A03 = r10
            long r0 = X.AnonymousClass7TG.A0I()
            int r2 = (int) r0
            r6.A00 = r2
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r6.A0Q = r0
            r0 = 2130970634(0x7f04080a, float:1.7549984E38)
            int r12 = X.2Yu.A0G(r14, r0)
            r6.A06 = r12
            X.JW6 r18 = new X.JW6
            r18.<init>()
            r0 = r18
            r6.A0V = r0
            r2 = 23592983(0x1680017, float:4.2611735E-38)
            X.2nK r1 = new X.2nK
            r1.<init>(r13, r0, r4, r2)
            r6.A0L = r1
            r0 = 49
            X.Iwa r11 = new X.Iwa
            r11.<init>(r6, r0)
            r6.A0W = r11
            android.content.res.Resources r1 = r14.getResources()
            r0 = 2131165248(0x7f070040, float:1.7944708E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r6.A07 = r0
            X.8gT r0 = X.C361578gS.A00(r4)
            r6.A0J = r0
            r0 = r32
            androidx.recyclerview.widget.RecyclerView r8 = r0.A00
            r3 = 0
            r8.setItemAnimator(r3)
            java.lang.Integer r0 = X.2cg.A00(r4)
            if (r0 != r10) goto L_0x00ac
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318514038118613(0x81077f000318d5, double:3.0313127483994136E-306)
            boolean r1 = X.182.A06(r2, r4, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L_0x00ac
            if (r1 == 0) goto L_0x00ac
            r8.setNestedScrollingEnabled(r9)
        L_0x00ac:
            boolean r0 = r8 instanceof com.instagram.creation.capture.quickcapture.gallery.gallerygrid.GalleryMediaGridView
            r2 = 0
            if (r0 == 0) goto L_0x02d2
            r0 = 7
            X.C60467Jlz.A00(r8, r6, r0)
            r0 = r8
            com.instagram.creation.capture.quickcapture.gallery.gallerygrid.GalleryMediaGridView r0 = (com.instagram.creation.capture.quickcapture.gallery.gallerygrid.GalleryMediaGridView) r0
            androidx.recyclerview.widget.GridLayoutManager r0 = r0.A01
            r6.A0A = r0
            int r15 = r0.A00
            int r1 = X.0nA.A09(r14)
            int r0 = r15 + -1
            int r12 = r12 * r0
            int r1 = r1 - r12
            int r1 = r1 / r15
        L_0x00c7:
            r6.A08 = r1
            X.8Qq r17 = new X.8Qq
            r20 = r17
            r21 = r13
            r22 = r4
            r23 = r10
            r24 = r1
            r25 = r1
            r26 = r2
            r20.<init>(r21, r22, r23, r24, r25, r26)
            X.0gy r12 = X.AnonymousClass07i.A00(r13)
            X.8XN r1 = new X.8XN
            r0 = r17
            r1.<init>(r12, r0)
            r1.A04 = r4
            X.JWn r12 = new X.JWn
            r0 = r33
            r12.<init>(r6, r0)
            r1.A07 = r12
            r1.A0B = r9
            r1.A0F = r9
            r1.A0C = r7
            r0 = r49 ^ 1
            r1.A0E = r0
            r1.A09 = r9
            X.2jE r0 = new X.2jE
            r0.<init>()
            boolean r0 = r0.A00(r4)
            if (r0 == 0) goto L_0x0119
            X.2jA r12 = new X.2jA
            r12.<init>()
            r1.A06 = r12
            r1.A0D = r9
            X.Lzj r0 = new X.Lzj
            r0.<init>(r14, r4, r12)
            r1.A08 = r0
        L_0x0119:
            r0 = r27
            boolean r0 = A09(r6, r0)
            if (r0 == 0) goto L_0x0125
            X.8XO r0 = X.AnonymousClass8XO.PHOTO_ONLY
            r1.A03 = r0
        L_0x0125:
            int r9 = r6.A08
            X.8XV r0 = new X.8XV
            r0.<init>(r4, r9)
            r1.A01 = r0
            X.8XU r12 = new X.8XU
            r12.<init>(r1)
            X.JWo r1 = new X.JWo
            r1.<init>(r6)
            androidx.recyclerview.widget.GridLayoutManager r0 = r6.A0A
            int r0 = r0.A00
            r15 = r0
            int r0 = r6.A08
            android.content.Context r9 = r6.A09
            boolean r31 = X.0oI.A0E(r9)
            X.JWM r9 = new X.JWM
            r27 = r46
            r24 = r43
            r26 = r15
            r28 = r0
            r29 = r16
            r30 = r7
            r20 = r9
            r23 = r1
            r25 = r15
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r6.A0F = r9
            X.0Tu r7 = X.0Tu.A05
            r0 = 36321060953924647(0x8109d000062427, double:3.032923428210756E-306)
            boolean r15 = X.182.A06(r7, r4, r0)
            if (r15 == 0) goto L_0x02ce
            r24 = r10
        L_0x016d:
            boolean r0 = X.182.A06(r7, r4, r0)
            if (r0 == 0) goto L_0x02ca
            java.lang.Integer r25 = X.AnonymousClass05K.A01
        L_0x0175:
            X.9Ii r16 = new X.9Ii
            r20 = r16
            r21 = r10
            r22 = r10
            r23 = r10
            r20.<init>((java.lang.Integer) r21, (java.lang.Integer) r22, (java.lang.Integer) r23, (java.lang.Integer) r24, (java.lang.Integer) r25)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.9Ig r15 = new X.9Ig
            r15.<init>((java.lang.Integer) r10, (java.lang.Integer) r10, (java.lang.Integer) r0, (java.lang.Integer) r3)
            X.9IV r1 = new X.9IV
            r10 = r19
            r0 = r16
            r1.<init>((int) r10, (java.lang.Object) r0, (java.lang.Object) r15)
            X.8XV r0 = r12.A06
            r10 = r0
            X.JWq r0 = new X.JWq
            r0.<init>(r6)
            X.JWL r15 = new X.JWL
            r29 = r48
            r20 = r15
            r21 = r14
            r22 = r1
            r23 = r18
            r24 = r10
            r25 = r17
            r26 = r4
            r27 = r9
            r28 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r6.A0G = r15
            androidx.recyclerview.widget.GridLayoutManager r14 = r6.A0A
            X.2t9 r10 = r15.A07
            int r1 = r14.A00
            X.0qQ.A0B(r10, r2)
            X.Jbj r0 = new X.Jbj
            r0.<init>(r10, r1, r2)
            r14.A01 = r0
            r15.A00 = r11
            boolean r1 = X.C361378g8.A00(r13, r4)
            boolean r0 = r9.A0B
            r9.A0B = r1
            if (r0 == r1) goto L_0x01d4
            r9.A07()
        L_0x01d4:
            X.8XW r0 = new X.8XW
            r0.<init>(r13, r3, r9, r12)
            r6.A0O = r0
            X.8gi r12 = new X.8gi
            r12.<init>(r8)
            r0 = r32
            com.instagram.common.ui.base.IgFrameLayout r1 = r0.A01
            X.8gk r0 = new X.8gk
            r0.<init>(r9, r12, r15)
            X.8gm r11 = new X.8gm
            r20 = r11
            r21 = r1
            r22 = r4
            r23 = r9
            r24 = r0
            r25 = r12
            r26 = r15
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r6.A0N = r11
            r0 = 750(0x2ee, double:3.705E-321)
            r11.A01 = r0
            X.4UR r0 = new X.4UR
            r0.<init>()
            r6.A0M = r0
            r8.setAdapter(r10)
            X.8gT r10 = X.C361578gS.A00(r4)
            X.0Ud r0 = r10.A06
            androidx.lifecycle.CoroutineLiveData r11 = X.DbT.A0G(r0)
            r1 = 23
            X.MMv r0 = new X.MMv
            r8 = r39
            r0.<init>(r1, r8, r6)
            r8 = 62
            X.Dba.A16(r5, r11, r0, r8)
            r1 = 3
            X.Jm5 r0 = new X.Jm5
            r0.<init>(r6, r1)
            r6.A0B = r0
            X.Jm5 r1 = new X.Jm5
            r0 = r19
            r1.<init>(r6, r0)
            r6.A0C = r1
            r9.A08(r3)
            X.2Fk r11 = r9.A0M
            r1 = 43
            X.Iwa r0 = new X.Iwa
            r0.<init>(r6, r1)
            X.Dba.A16(r5, r11, r0, r8)
            X.2Fk r11 = r9.A0K
            r1 = 44
            X.Iwa r0 = new X.Iwa
            r0.<init>(r6, r1)
            X.Dba.A16(r5, r11, r0, r8)
            X.2Fk r9 = r9.A0L
            r1 = 45
            X.Iwa r0 = new X.Iwa
            r0.<init>(r6, r1)
            X.Dba.A16(r5, r9, r0, r8)
            r0 = 36316662907015732(0x8105d000001234, double:3.030142085636045E-306)
            boolean r0 = X.182.A06(r7, r4, r0)
            java.lang.String r9 = "posts"
            if (r0 == 0) goto L_0x026c
            r10.A03(r9)
        L_0x026c:
            r0 = 36316662907540027(0x8105d00008123b, double:3.030142085967611E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r7, r4, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x028a
            X.2Fk r4 = r10.A00
            r1 = 46
            X.Iwa r0 = new X.Iwa
            r0.<init>(r6, r1)
            X.Dba.A16(r5, r4, r0, r8)
            r10.A04(r9)
        L_0x028a:
            r1 = 2
            X.AWR r0 = new X.AWR
            r0.<init>(r6, r1)
            r6.A0U = r0
            com.instagram.common.session.UserSession r1 = r6.A0E
            boolean r0 = X.C319116q4.A08(r1, r2)
            if (r0 == 0) goto L_0x02b9
            X.4DH r7 = r6.A0D
            r0 = 11
            X.KAf r5 = new X.KAf
            r5.<init>(r6, r0)
            X.1NY r4 = X.AnonymousClass7TG.A0b(r1)
            java.lang.String r0 = "content_scheduling/get_scheduled_content/"
            r4.A0A(r0)
            java.lang.Class<X.K0l> r1 = X.C61276K0l.class
            java.lang.Class<X.JZE> r0 = X.JZE.class
            X.1OC r0 = X.DbT.A0R(r3, r4, r1, r0, r2)
            r0.A00 = r5
            r7.schedule(r0)
        L_0x02b9:
            boolean r0 = A08(r6)
            if (r0 == 0) goto L_0x02c9
            X.LlF r1 = new X.LlF
            r1.<init>(r6)
            r0 = r33
            r0.A00(r1)
        L_0x02c9:
            return
        L_0x02ca:
            r25 = r10
            goto L_0x0175
        L_0x02ce:
            java.lang.Integer r24 = X.AnonymousClass05K.A01
            goto L_0x016d
        L_0x02d2:
            X.8gZ r0 = new X.8gZ
            r0.<init>(r12, r2)
            r8.A11(r0)
            int r0 = r45.intValue()
            if (r0 == 0) goto L_0x02fb
            r1 = 4
        L_0x02e1:
            androidx.recyclerview.widget.GridLayoutManager r0 = new androidx.recyclerview.widget.GridLayoutManager
            r0.<init>(r14, r1)
            r6.A0A = r0
            r8.setLayoutManager(r0)
            r8.setVisibility(r2)
            int r15 = r0.A00
            int r1 = X.AnonymousClass8XF.A01(r14)
            int r0 = r15 + -1
            int r12 = r12 * r0
            int r1 = r1 - r12
            int r1 = r1 / r15
            goto L_0x00c7
        L_0x02fb:
            r1 = 3
            goto L_0x02e1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JW8.<init>(android.content.Context, androidx.fragment.app.FragmentActivity, X.4DH, com.instagram.common.session.UserSession, X.JWb, X.JWm, X.JWk, X.82q, X.MUO, X.8gQ, java.lang.Integer, int, boolean, boolean, boolean):void");
    }
}
