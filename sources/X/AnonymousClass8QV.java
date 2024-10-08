package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.archive.fragment.ArchiveReelFragment;
import com.instagram.common.gallery.Draft;
import com.instagram.common.gallery.GeneratedMediaMetadata;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8QV  reason: invalid class name */
public final class AnonymousClass8QV implements AnonymousClass8QW {
    public final DirectCameraViewModel A00;
    public final boolean A01;
    public final /* synthetic */ AnonymousClass8QN A02;

    public final /* synthetic */ void D3h(Integer num) {
    }

    public AnonymousClass8QV(AnonymousClass8QN r1, DirectCameraViewModel directCameraViewModel, boolean z) {
        this.A02 = r1;
        this.A01 = z;
        this.A00 = directCameraViewModel;
    }

    public final /* synthetic */ boolean Cdb() {
        return false;
    }

    public final void DBA(int i) {
        GalleryItem galleryItem;
        C365798nh r4;
        Object obj;
        Integer num;
        AnonymousClass8QN r42 = this.A02;
        AnonymousClass8QP r3 = r42.A0Y;
        int i2 = i;
        GalleryItem galleryItem2 = r3.BJM(i2).A01;
        int i3 = GalleryItem.A0B + 1;
        GalleryItem.A0B = i3;
        String A0O = 002.A0O(galleryItem2.A0A, i3);
        Integer num2 = galleryItem2.A09;
        if (num2 == AnonymousClass05K.A00) {
            Medium medium = galleryItem2.A00;
            if (medium != null) {
                galleryItem = new GalleryItem.LocalGalleryMedium(medium, A0O);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            Draft draft = galleryItem2.A02;
            RemoteMedia remoteMedia = galleryItem2.A04;
            AnonymousClass8y3 r10 = galleryItem2.A05;
            C352218Cl r12 = galleryItem2.A07;
            C349307zv r13 = galleryItem2.A08;
            galleryItem = new GalleryItem(draft, (GeneratedMediaMetadata) null, galleryItem2.A00, remoteMedia, r10, galleryItem2.A06, r12, r13, num2, A0O, galleryItem2.A01);
        }
        AnonymousClass9SZ r6 = new AnonymousClass9SZ(galleryItem, (Bitmap) null);
        int i4 = i + 1;
        if (r3.A01(r6, i4)) {
            String str = r6.A01.A0A;
            C3499482o r62 = r42.A0Q.A02;
            C365798nh r43 = (C365798nh) r62.A05().get(i2);
            if (r43.A05 == C365758nd.A04) {
                C352218Cl r0 = r43.A02;
                r0.getClass();
                r4 = new C365798nh((Bitmap) null, r0, str, false);
            } else {
                C349307zv r02 = r43.A03;
                r02.getClass();
                r4 = new C365798nh(r02, str);
            }
            AnonymousClass82Y r32 = r62.A01;
            List list = r32.A0o;
            if (i2 < list.size()) {
                obj = list.get(i2);
            } else {
                obj = null;
            }
            List list2 = r32.A0m;
            list2.add(i4, r4);
            list.add(obj);
            if (list2.size() == 1) {
                num = AnonymousClass05K.A01;
            } else {
                num = AnonymousClass05K.A0C;
            }
            r32.A0B = num;
            return;
        }
        Activity activity = r42.A0A;
        0qQ.A0B(activity, 0);
        String string = activity.getResources().getString(2131973048, new Object[]{10});
        0qQ.A07(string);
        C59689JTv.A09(activity, string);
    }

    public final void Dik() {
        String string;
        AnonymousClass8QN r4 = this.A02;
        if (r4.A0m.get() == 28D.A2T) {
            List<C365798nh> A05 = r4.A0Q.A02.A05();
            AnonymousClass8QA r7 = r4.A0K;
            r7.A0E(false);
            for (C365798nh r5 : A05) {
                if (r7.A0H.A00.containsKey(r5.A06)) {
                    r4.A0k.put(r5.A02(), new C370018vh(r7.A07(r5)));
                }
            }
            r4.A0S.A0l.E11();
            r4.A0g.run();
            AnonymousClass80U r0 = r4.A0Z;
            ((AnonymousClass80T) r0).A02.A04(new Object());
            return;
        }
        AnonymousClass8QP r1 = r4.A0Y;
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass9SZ r02 : r1.A01) {
            arrayList.add(r02.A01.A0A);
        }
        AnonymousClass87G A012 = r4.A0R.A0H.A01();
        A012.getClass();
        AnonymousClass87I r3 = A012.A04;
        if (r3 == null) {
            r3 = AnonymousClass87I.EMPTY;
        }
        if (r3.equals(AnonymousClass87I.BIRTHDAY_HIGHLIGHTS)) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(C273654mx.A00(119), true);
            bundle.putBoolean(AnonymousClass000.A00(3455), true);
            bundle.putStringArrayList(AnonymousClass000.A00(3351), arrayList);
            UserSession userSession = r4.A0G;
            FragmentActivity fragmentActivity = r4.A0A;
            ArchiveReelFragment A002 = AnonymousClass6WB.A00(bundle, fragmentActivity, userSession, C273654mx.A00(233));
            A002.getClass();
            A002.A05 = r4;
            A002.A06 = r1;
            C309516Yo r12 = new C309516Yo(fragmentActivity, userSession);
            r12.A0B((Bundle) null, A002);
            r12.A03();
            return;
        }
        User user = r4.A0Q.A02.A01.A0A;
        C61431K7g k7g = new C61431K7g();
        Bundle bundle2 = new Bundle();
        UserSession userSession2 = r4.A0G;
        bundle2.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession2.A05);
        bundle2.putStringArrayList(AnonymousClass000.A00(3946), arrayList);
        String A003 = AnonymousClass000.A00(2998);
        if (user == null) {
            bundle2.putString(A003, AnonymousClass87I.END_OF_YEAR.A00);
            string = r4.A0A.getResources().getString(2131974268);
        } else {
            bundle2.putString(A003, AnonymousClass87I.SHOUTOUT.A00);
            bundle2.putString(C66579MXk.A00(164), user.getId());
            string = r4.A0A.getResources().getString(2131973620, new Object[]{user.getUsername()});
        }
        k7g.setArguments(bundle2);
        k7g.A01 = r4;
        C331127Pr r13 = new C331127Pr(userSession2);
        r13.A0d = string;
        r13.A0T = k7g;
        r13.A0a = true;
        r13.A03 = 0.7f;
        r13.A00().A0D(r4.A0E.requireContext(), k7g);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r63v4, resolved type: com.instagram.camera.effect.models.CameraAREffect} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.util.LinkedHashMap} */
    /* JADX WARNING: type inference failed for: r7v10, types: [com.instagram.camera.effect.models.CameraAREffect] */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0300, code lost:
        if (r3.isEmpty() != false) goto L_0x0302;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0320, code lost:
        if (r14 != false) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        if (X.182.A06(X.0Tu.A05, r4, 36323625049140543L) == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0489, code lost:
        if (r1.A00() != true) goto L_0x048b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x048d, code lost:
        if (r0 != null) goto L_0x048f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0491, code lost:
        if (r0.A05 == null) goto L_0x0546;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0493, code lost:
        r83 = X.C59895JbK.A00(r0.A05.A06);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x049d, code lost:
        if (r0.A05 == null) goto L_0x054c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x049f, code lost:
        r1 = r0.A05;
        r63 = X.C59895JbK.A04(r1.A0E, r1.A0F);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04a9, code lost:
        r66 = X.AEE.A00(r0.A04);
        X.AEE.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04b2, code lost:
        r69 = r5.A04();
        r65 = r5.A01();
        r79 = X.C394979z0.A00(r5);
        r16 = r5.A0g;
        r15 = r5.A0e;
        r14 = r5.A0i;
        X.0qQ.A0B(r13, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04c9, code lost:
        if (r8 == false) goto L_0x0564;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04cb, code lost:
        if (r12 == null) goto L_0x0564;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x04cd, code lost:
        r32 = new X.C40368Ab1(r2.A0A.getApplicationContext(), r2.A0G, r1, r25, r32, r3, r5, r39.toString(), r18, r60);
        r43.A06(r19, (X.1GK) null, (X.1GK) null, r7, (X.B1O) null, r0, r1, (X.C381539bv) null, r32, r3, (X.L8M) null, (X.AnonymousClass8VT) null, (X.C15023UKc) null, r5, (java.lang.Boolean) null, false, "post_capture", r30, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.Set) null, new X.C41454AuE(r32), new X.C41453AuD(), r60, false, false);
        r3 = new X.A52((X.C365798nh) r31.get(r9), r32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0546, code lost:
        r83 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0548, code lost:
        if (r0 == null) goto L_0x054c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x054c, code lost:
        r63 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x054e, code lost:
        if (r0 != null) goto L_0x04a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0550, code lost:
        r66 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0564, code lost:
        r1 = r2.A0G;
        r4 = r39.toString();
        X.0qQ.A0B(r1, 1);
        X.0qQ.A0B(r7, 15);
        X.0qQ.A0B(r4, 16);
        r1 = r18;
        X.0qQ.A0B(r1, 20);
        r43.A04(r59, r19, (X.1GK) null, (X.1GK) null, r7, (X.B1O) null, r0, r1, (X.C381539bv) null, r32, r3, (X.L8M) null, (X.AnonymousClass8VT) null, (X.C15023UKc) null, r5, (java.lang.Boolean) null, false, "post_capture", r30, (java.lang.String) null, (java.lang.String) null, r4, (java.lang.String) null, r1, (java.util.List) null, (java.util.List) null, (java.util.Set) null, r60, false, false);
        r13.A02(r63, r64, r65, r66, (X.C254743sy) null, r68, r69, r70, r71, r72, r17, (java.lang.String) null, (java.lang.String) null, r16, r15, r14, r79, r80, r81, r82, r83, r84);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00f6, code lost:
        if ((r0 instanceof X.AnonymousClass9HR) == false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01c5, code lost:
        if (r4.A00() != true) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01c9, code lost:
        if (r0 != null) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01cd, code lost:
        if (r0.A05 == null) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01cf, code lost:
        r82 = X.C59895JbK.A00(r0.A05.A06);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01d9, code lost:
        if (r0.A05 == null) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01db, code lost:
        r4 = r0.A05;
        r62 = X.C59895JbK.A04(r4.A0E, r4.A0F);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01e5, code lost:
        r65 = X.AEE.A00(r0.A04);
        X.AEE.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ee, code lost:
        r68 = r3.A04();
        r64 = r3.A02();
        X.0qQ.A0B(r14, 1);
        r5 = r2.A0G;
        r57 = r11.A0F(r1);
        r1 = r13.A0O;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0201, code lost:
        if (r1 == null) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0203, code lost:
        r51 = r1.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0207, code lost:
        if (r0 == null) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0209, code lost:
        r1 = r0.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x020b, code lost:
        r32 = new X.C40367Ab0(r5, r19, (X.1GK) null, r0, r37, r1, (X.C381539bv) null, r1, r25, r32, r3, (X.L8M) null, (X.AnonymousClass8VT) null, r46, (java.lang.Boolean) null, "post_capture", r49, (java.lang.String) null, r51, (java.lang.String) null, (java.lang.String) null, r18, (java.util.List) null, (java.util.List) null, r57, r60);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x022e, code lost:
        if (r8 == false) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0230, code lost:
        if (r12 == null) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0232, code lost:
        r3 = new X.A52((X.C365798nh) r31.get(r9), r32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0246, code lost:
        r32.ELx(r59, (java.lang.String) null, false);
        r14.A02(r62, r7, r64, r65, (X.C254743sy) null, r67, r68, r16, r70, r71, r15, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, r79, r80, r17, r82, r83);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0269, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x026b, code lost:
        r51 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x026e, code lost:
        r82 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0270, code lost:
        if (r0 == null) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0274, code lost:
        r62 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0276, code lost:
        if (r0 != null) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0278, code lost:
        r65 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0336 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Du1(X.C53401GnY r88) {
        /*
            r87 = this;
            r1 = r87
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x05e3
            com.instagram.model.direct.camera.DirectCameraViewModel r0 = r1.A00
            r25 = r0
            if (r0 == 0) goto L_0x05e3
            X.8QN r2 = r1.A02
            X.8QA r11 = r2.A0K
            r6 = 0
            r11.A0D(r6)
            com.instagram.model.direct.DirectShareTarget r5 = r0.A03
            if (r5 == 0) goto L_0x05db
            int r4 = r0.A00
            r26 = 8
            r0 = r26
            if (r4 != r0) goto L_0x05d7
            com.instagram.pendingmedia.model.constants.ShareType r3 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE
        L_0x0022:
            r24 = 0
            X.LD4 r21 = new X.LD4
            r1 = r21
            r0 = r24
            r1.<init>(r5, r0, r3)
            r60 = 0
            r0 = r26
            if (r4 != r0) goto L_0x0049
            r60 = 1
            com.instagram.common.session.UserSession r4 = r2.A0G
            X.0qQ.A0B(r4, r6)
            X.0Tu r3 = X.0Tu.A05
            r0 = 36323625049140543(0x810c2500022d3f, double:3.0345449723500716E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            r29 = 1
            if (r0 != 0) goto L_0x004b
        L_0x0049:
            r29 = 0
        L_0x004b:
            X.80D r0 = r2.A0S
            boolean r8 = r0.A3B
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r30 = r0.toString()
            X.82p r0 = r2.A0Q
            r86 = r0
            X.82o r0 = r0.A02
            r85 = r0
            java.util.List r31 = r85.A05()
            java.util.ArrayList r23 = new java.util.ArrayList
            r23.<init>()
            r11.A0E(r6)
            if (r8 == 0) goto L_0x05d4
            int r0 = r31.size()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r0)
        L_0x0076:
            int r28 = r31.size()
            r10 = 1
            r9 = 0
            r27 = 1
        L_0x007e:
            r0 = r28
            if (r9 >= r0) goto L_0x05f3
            X.8BA r13 = r2.A0N
            java.lang.String r33 = r13.A0T()
            java.lang.String r1 = r2.A0j
            r0 = r25
            boolean r3 = r0.A08
            java.lang.String r36 = r13.A0S()
            java.lang.String r4 = r0.A05
            java.lang.String r0 = r2.A0i
            java.lang.String r40 = X.HZX.A00()
            X.9cJ r22 = new X.9cJ
            r32 = r22
            r34 = r1
            r35 = r24
            r37 = r4
            r38 = r0
            r39 = r3
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40)
            r0 = r30
            X.0qQ.A0B(r0, r6)
            int r0 = r28 - r9
            int r4 = r0 + -1
            X.A6R r20 = new X.A6R
            r3 = r20
            r1 = r30
            r0 = r28
            r3.<init>(r1, r4, r0)
            r0 = r31
            java.lang.Object r1 = r0.get(r9)
            X.8nh r1 = (X.C365798nh) r1
            X.8pU r4 = r11.A07(r1)
            r0 = r23
            r0.add(r4)
            java.lang.String r3 = r1.A06
            X.0qQ.A0B(r3, r6)
            java.util.Map r0 = r11.A0L
            java.lang.Object r19 = r0.get(r3)
            r0 = r19
            X.1GK r0 = (X.1GK) r0
            r19 = r0
            boolean r0 = r21.A00()
            if (r0 == 0) goto L_0x00f8
            r0 = r21
            com.instagram.model.direct.DirectShareTarget r0 = r0.A00
            r0.getClass()
            X.3t2 r0 = r0.A09
            r0.getClass()
            boolean r0 = r0 instanceof X.AnonymousClass9HR
            r15 = 1
            if (r0 != 0) goto L_0x00f9
        L_0x00f8:
            r15 = 0
        L_0x00f9:
            r0 = r22
            java.lang.String r0 = r0.A00
            r18 = r0
            if (r0 != 0) goto L_0x0105
            java.lang.String r18 = X.HZX.A00()
        L_0x0105:
            X.8nd r0 = r1.A05
            int r0 = r0.ordinal()
            r59 = r88
            if (r0 == r6) goto L_0x02eb
            X.7zv r3 = r1.A03
            r3.getClass()
            X.8pV r0 = r4.A03
            r5 = r86
            X.28D r7 = r5.A01
            X.28D r5 = X.28D.A2S
            if (r7 != r5) goto L_0x013f
            if (r15 != 0) goto L_0x0124
            if (r29 != 0) goto L_0x0124
            if (r8 != 0) goto L_0x013f
        L_0x0124:
            X.8KX r7 = r2.A0d
            r5 = r21
            com.instagram.model.direct.DirectShareTarget r5 = r5.A00
            int r14 = r3.A0F
            java.lang.Integer r36 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r37 = X.AnonymousClass05K.A1I
            r32 = r7
            r33 = r5
            r34 = r25
            r35 = r22
            r38 = r18
            r32.A00(r33, r34, r35, r36, r37, r38)
        L_0x013f:
            X.8L3 r5 = r2.A0W
            r37 = r5
            boolean r56 = r11.A0F(r1)
            r7 = 0
            X.8Cl r5 = r13.A0O
            if (r5 == 0) goto L_0x02e7
            java.lang.String r51 = r5.A06()
        L_0x0150:
            java.lang.String r48 = "post_capture"
            r39 = r37
            r40 = r0
            r41 = r21
            r42 = r7
            r43 = r22
            r44 = r20
            r45 = r7
            r46 = r3
            r47 = r7
            r49 = r30
            r50 = r7
            r52 = r7
            r53 = r7
            r54 = r7
            r55 = r7
            X.3Q2 r5 = r39.A04(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
            if (r15 != 0) goto L_0x0286
            if (r29 != 0) goto L_0x0286
            if (r0 == 0) goto L_0x0283
            X.8PW r4 = r0.A05
            if (r4 == 0) goto L_0x0283
            X.8PW r4 = r0.A05
            java.util.List r5 = r4.A0E
        L_0x0182:
            X.8Jw r14 = r2.A0a
            int r80 = X.C59895JbK.A02(r21)
            X.1iA r67 = X.1iA.A0a
            int r4 = r3.A0F
            r17 = r4
            java.lang.String r4 = r3.A0f
            r16 = r4
            java.lang.String r70 = r3.A05()
            if (r0 == 0) goto L_0x019a
            com.instagram.camera.effect.models.CameraAREffect r7 = r0.A00
        L_0x019a:
            if (r5 == 0) goto L_0x027f
            com.instagram.common.session.UserSession r4 = r2.A0G
            java.util.HashMap r79 = X.C59895JbK.A0D(r4, r5)
        L_0x01a2:
            if (r0 == 0) goto L_0x027c
            X.8PW r4 = r0.A05
            if (r4 == 0) goto L_0x027c
            X.8PW r4 = r0.A05
            java.util.List r4 = r4.A0D
        L_0x01ac:
            X.C59895JbK.A09(r4)
            java.lang.String r71 = X.C59895JbK.A0B(r86)
            java.lang.String r15 = r3.A0g
            if (r0 == 0) goto L_0x01c7
            X.8PW r4 = r0.A05
            if (r4 == 0) goto L_0x01c7
            X.8PW r4 = r0.A05
            if (r4 == 0) goto L_0x01c7
            boolean r4 = r4.A00()
            r83 = 1
            if (r4 == r10) goto L_0x01cb
        L_0x01c7:
            r83 = 0
            if (r0 == 0) goto L_0x026e
        L_0x01cb:
            X.8PW r4 = r0.A05
            if (r4 == 0) goto L_0x026e
            X.8PW r4 = r0.A05
            X.8Nz r4 = r4.A06
            int r82 = X.C59895JbK.A00(r4)
        L_0x01d7:
            X.8PW r4 = r0.A05
            if (r4 == 0) goto L_0x0274
            X.8PW r4 = r0.A05
            java.util.List r5 = r4.A0E
            java.util.List r4 = r4.A0F
            android.util.Pair r62 = X.C59895JbK.A04(r5, r4)
        L_0x01e5:
            X.8pT r4 = r0.A04
            com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation r65 = X.AEE.A00(r4)
            X.AEE.A02(r0)
        L_0x01ee:
            java.lang.Integer r68 = r3.A04()
            com.instagram.common.gallery.metadata.MediaUploadMetadata r64 = r3.A02()
            X.0qQ.A0B(r14, r10)
            com.instagram.common.session.UserSession r5 = r2.A0G
            boolean r57 = r11.A0F(r1)
            X.8Cl r1 = r13.A0O
            if (r1 == 0) goto L_0x026b
            java.lang.String r51 = r1.A06()
        L_0x0207:
            if (r0 == 0) goto L_0x0269
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r1 = r0.A06
        L_0x020b:
            X.Ab0 r4 = new X.Ab0
            r32 = r4
            r33 = r5
            r34 = r19
            r35 = r24
            r36 = r0
            r38 = r21
            r39 = r24
            r40 = r1
            r41 = r25
            r42 = r22
            r43 = r20
            r44 = r24
            r54 = r18
            r56 = r24
            r58 = r60
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            if (r8 == 0) goto L_0x0246
            if (r12 == 0) goto L_0x0246
            r0 = r31
            java.lang.Object r0 = r0.get(r9)
            X.8nh r0 = (X.C365798nh) r0
            X.A52 r3 = new X.A52
            r3.<init>(r0, r4)
        L_0x023f:
            r12.add(r3)
        L_0x0242:
            int r9 = r9 + 1
            goto L_0x007e
        L_0x0246:
            r1 = r59
            r0 = r24
            r4.ELx(r1, r0, r6)
            r61 = r14
            r63 = r7
            r66 = r0
            r69 = r16
            r72 = r15
            r73 = r0
            r74 = r0
            r75 = r0
            r76 = r0
            r77 = r0
            r78 = r0
            r81 = r17
            r61.A02(r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83)
            goto L_0x0242
        L_0x0269:
            r1 = 0
            goto L_0x020b
        L_0x026b:
            r51 = 0
            goto L_0x0207
        L_0x026e:
            r82 = 0
            if (r0 == 0) goto L_0x0274
            goto L_0x01d7
        L_0x0274:
            r62 = 0
            if (r0 != 0) goto L_0x01e5
            r65 = 0
            goto L_0x01ee
        L_0x027c:
            r4 = 0
            goto L_0x01ac
        L_0x027f:
            r79 = 0
            goto L_0x01a2
        L_0x0283:
            r5 = 0
            goto L_0x0182
        L_0x0286:
            if (r0 == 0) goto L_0x02a8
            X.8PW r1 = r0.A05
            if (r1 == 0) goto L_0x02a8
            X.8PW r1 = r0.A05
            java.util.LinkedHashMap r1 = r1.A09
            if (r1 == 0) goto L_0x02a8
            X.8PW r1 = r0.A05
            java.util.LinkedHashMap r7 = r1.A09
            com.instagram.common.session.UserSession r1 = r2.A0G     // Catch:{ IOException -> 0x02a0 }
            X.8PW r0 = r0.A05     // Catch:{ IOException -> 0x02a0 }
            java.util.LinkedHashMap r0 = r0.A09     // Catch:{ IOException -> 0x02a0 }
            X.AB8.A01(r1, r5, r0)     // Catch:{ IOException -> 0x02a0 }
            goto L_0x02a8
        L_0x02a0:
            r13 = move-exception
            java.lang.String r1 = "MultiMediaEditController_sendMessageMsys"
            java.lang.String r0 = "Failed to set dynamic drawables"
            X.0kD.A07(r1, r0, r13)
        L_0x02a8:
            if (r15 == 0) goto L_0x02c6
            android.app.Activity r3 = r2.A0A
            com.instagram.common.session.UserSession r1 = r2.A0G
            r0 = r21
            com.instagram.model.direct.DirectShareTarget r0 = r0.A00
            r0.getClass()
            java.lang.String r19 = "MultiMediaEditController_sendMessageMsys"
            X.AGu r13 = X.C39622A2m.A02
            r14 = r3
            r15 = r1
            r16 = r0
            r17 = r22
            r18 = r5
            r13.A02(r14, r15, r16, r17, r18, r19)
            goto L_0x0242
        L_0x02c6:
            if (r8 != 0) goto L_0x0242
            X.8LU r0 = r2.A0O
            boolean r61 = r4.A00()
            r51 = r0
            r52 = r59
            r53 = r19
            r54 = r21
            r55 = r22
            r56 = r20
            r57 = r5
            r58 = r3
            r59 = r7
            r51.A0M(r52, r53, r54, r55, r56, r57, r58, r59, r60, r61)
            r27 = 0
            goto L_0x0242
        L_0x02e7:
            r51 = 0
            goto L_0x0150
        L_0x02eb:
            X.8Cl r5 = r1.A02
            r5.getClass()
            X.8lx r0 = r4.A02
            if (r0 == 0) goto L_0x03b6
            com.instagram.camera.effect.models.CameraAREffect r13 = r0.A01
            java.util.LinkedHashMap r3 = r0.A07
            r14 = 1
            if (r3 == 0) goto L_0x0302
            boolean r3 = r3.isEmpty()
            r7 = 1
            if (r3 == 0) goto L_0x0303
        L_0x0302:
            r7 = 0
        L_0x0303:
            if (r13 == 0) goto L_0x030b
            boolean r3 = r13.A0K()
            if (r3 != 0) goto L_0x030e
        L_0x030b:
            if (r7 != 0) goto L_0x030e
            r14 = 0
        L_0x030e:
            X.8KO r3 = r2.A0V
            r43 = r3
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r7 = r2.A0P
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r13 = r3.A02(r7, r0, r5)
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r3 = r3.A05(r13, r0, r5)
            if (r15 == 0) goto L_0x0322
            r17 = 1
            if (r14 == 0) goto L_0x03b2
        L_0x0322:
            r17 = 0
            if (r14 == 0) goto L_0x03b2
            if (r15 != 0) goto L_0x032a
            if (r29 == 0) goto L_0x03b2
        L_0x032a:
            r16 = 1
        L_0x032c:
            r13 = r86
            X.28D r13 = r13.A01
            r39 = r13
            X.28D r14 = X.28D.A2S
            if (r13 != r14) goto L_0x0357
            if (r17 != 0) goto L_0x033c
            if (r16 != 0) goto L_0x033c
            if (r8 != 0) goto L_0x03b9
        L_0x033c:
            X.8KX r15 = r2.A0d
            r13 = r21
            com.instagram.model.direct.DirectShareTarget r13 = r13.A00
            int r14 = r5.A08
            java.lang.Integer r36 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r37 = X.AnonymousClass05K.A1F
            r32 = r15
            r33 = r13
            r34 = r25
            r35 = r22
            r38 = r18
            r32.A00(r33, r34, r35, r36, r37, r38)
        L_0x0357:
            if (r17 == 0) goto L_0x03f1
            android.app.Activity r13 = r2.A0A
            com.instagram.common.session.UserSession r4 = r2.A0G
            r0 = r21
            com.instagram.model.direct.DirectShareTarget r14 = r0.A00
            r14.getClass()
            X.AGu r0 = X.C39622A2m.A02
            X.0qQ.A0B(r13, r6)
            X.0qQ.A0B(r4, r10)
            r0 = r26
            X.0qQ.A0B(r7, r0)
            X.Aaw r1 = new X.Aaw
            r0 = r22
            r1.<init>(r13, r4, r14, r0)
            X.8KN r0 = new X.8KN
            r0.<init>(r7)
            X.L83 r37 = r0.A00()
            android.content.Context r33 = r13.getApplicationContext()
            X.0qQ.A07(r33)
            X.Asr r0 = new X.Asr
            r32 = r0
            r34 = r24
            r35 = r4
            r36 = r1
            r38 = r3
            r39 = r5
            r40 = r6
            r41 = r6
            r42 = r6
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            r1 = 472(0x1d8, float:6.61E-43)
            X.5g0 r3 = new X.5g0
            r3.<init>(r0, r1)
            X.3z9 r1 = X.C39622A2m.A00
            X.Ako r0 = new X.Ako
            r0.<init>(r3)
            r1.Eyj(r0)
            goto L_0x0242
        L_0x03b2:
            r16 = 0
            goto L_0x032c
        L_0x03b6:
            r14 = 0
            goto L_0x030e
        L_0x03b9:
            if (r60 == 0) goto L_0x0438
            boolean r3 = r4.A00()
            if (r3 != 0) goto L_0x0438
            com.instagram.common.session.UserSession r13 = r2.A0G
            X.0qQ.A0B(r13, r6)
            X.0Tu r14 = X.0Tu.A05
            r3 = 36323625049533764(0x810c2500082d44, double:3.034544972598746E-306)
            boolean r3 = X.182.A06(r14, r13, r3)
            if (r3 == 0) goto L_0x0438
            if (r8 != 0) goto L_0x0438
            boolean r1 = r1.A04
            X.1pL r32 = X.C66551pM.A00()
            X.8K7 r0 = r2.A0X
            r33 = r59
            r34 = r13
            r35 = r0
            r36 = r21
            r37 = r22
            r38 = r20
            r39 = r5
            r40 = r1
            r32.EMF(r33, r34, r35, r36, r37, r38, r39, r40)
            goto L_0x0434
        L_0x03f1:
            if (r16 == 0) goto L_0x03b9
            X.8Kv r4 = r2.A0b
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r3 = (com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r3
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r3 = r3.A02
            r1 = r85
            X.82Y r1 = r1.A01
            X.8Yz r1 = r1.A0X
            boolean r40 = X.C379509Ue.A00(r1)
            X.Aat r36 = new X.Aat
            r41 = r36
            r42 = r59
            r43 = r2
            r44 = r21
            r45 = r22
            r46 = r20
            r47 = r8
            r41.<init>(r42, r43, r44, r45, r46, r47)
            X.4Cq r7 = r4.A05
            com.instagram.creation.capture.quickcapture.util.phototovideo.saver.PhotoToVideoSaver$savePhoto$2 r1 = new com.instagram.creation.capture.quickcapture.util.phototovideo.saver.PhotoToVideoSaver$savePhoto$2
            r32 = r1
            r33 = r3
            r34 = r19
            r35 = r0
            r37 = r4
            r38 = r5
            r39 = r24
            r41 = r6
            r42 = r6
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            X.19B r0 = X.19B.A00
            X.1Eo.A05(r0, r1, r7)
        L_0x0434:
            r27 = 0
            goto L_0x0242
        L_0x0438:
            if (r0 == 0) goto L_0x0560
            X.8PW r1 = r0.A05
            if (r1 == 0) goto L_0x0560
            X.8PW r1 = r0.A05
            java.util.List r3 = r1.A0E
        L_0x0442:
            X.8Jw r13 = r2.A0a
            int r81 = X.C59895JbK.A02(r21)
            X.1iA r68 = X.1iA.A0Q
            int r1 = r5.A08
            r82 = r1
            java.lang.String r1 = r5.A0a
            r70 = r1
            java.lang.String r71 = r5.A05()
            if (r0 == 0) goto L_0x055c
            com.instagram.camera.effect.models.CameraAREffect r1 = r0.A01
            r64 = r1
        L_0x045c:
            if (r3 == 0) goto L_0x0558
            com.instagram.common.session.UserSession r1 = r2.A0G
            java.util.HashMap r80 = X.C59895JbK.A0D(r1, r3)
        L_0x0464:
            if (r0 == 0) goto L_0x0554
            X.8PW r1 = r0.A05
            if (r1 == 0) goto L_0x0554
            X.8PW r1 = r0.A05
            java.util.List r1 = r1.A0D
        L_0x046e:
            X.C59895JbK.A09(r1)
            java.lang.String r72 = X.C59895JbK.A0B(r86)
            java.lang.String r1 = r5.A0b
            r17 = r1
            if (r0 == 0) goto L_0x048b
            X.8PW r1 = r0.A05
            if (r1 == 0) goto L_0x048b
            X.8PW r1 = r0.A05
            if (r1 == 0) goto L_0x048b
            boolean r1 = r1.A00()
            r84 = 1
            if (r1 == r10) goto L_0x048f
        L_0x048b:
            r84 = 0
            if (r0 == 0) goto L_0x0546
        L_0x048f:
            X.8PW r1 = r0.A05
            if (r1 == 0) goto L_0x0546
            X.8PW r1 = r0.A05
            X.8Nz r1 = r1.A06
            int r83 = X.C59895JbK.A00(r1)
        L_0x049b:
            X.8PW r1 = r0.A05
            if (r1 == 0) goto L_0x054c
            X.8PW r1 = r0.A05
            java.util.List r3 = r1.A0E
            java.util.List r1 = r1.A0F
            android.util.Pair r63 = X.C59895JbK.A04(r3, r1)
        L_0x04a9:
            X.8pT r1 = r0.A04
            com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation r66 = X.AEE.A00(r1)
            X.AEE.A01(r0)
        L_0x04b2:
            java.lang.Integer r69 = r5.A04()
            com.instagram.common.gallery.metadata.MediaUploadMetadata r65 = r5.A01()
            java.util.List r79 = X.C394979z0.A00(r5)
            java.lang.String r1 = r5.A0g
            r16 = r1
            java.lang.String r15 = r5.A0e
            java.lang.String r14 = r5.A0i
            X.0qQ.A0B(r13, r10)
            if (r8 == 0) goto L_0x0564
            if (r12 == 0) goto L_0x0564
            android.app.Activity r1 = r2.A0A
            android.content.Context r33 = r1.getApplicationContext()
            com.instagram.common.session.UserSession r3 = r2.A0G
            java.lang.String r40 = r39.toString()
            X.Ab1 r1 = new X.Ab1
            r32 = r1
            r34 = r3
            r35 = r21
            r36 = r25
            r37 = r22
            r38 = r20
            r39 = r5
            r41 = r18
            r42 = r60
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            java.lang.Boolean r49 = java.lang.Boolean.valueOf(r6)
            X.AuE r3 = new X.AuE
            r3.<init>(r1)
            X.AuD r59 = new X.AuD
            r59.<init>()
            java.lang.String r50 = "post_capture"
            r33 = r43
            r34 = r19
            r35 = r24
            r36 = r24
            r37 = r7
            r38 = r24
            r39 = r0
            r40 = r21
            r41 = r24
            r42 = r22
            r43 = r20
            r44 = r24
            r45 = r24
            r46 = r24
            r47 = r5
            r48 = r24
            r51 = r30
            r52 = r24
            r53 = r24
            r54 = r24
            r55 = r24
            r56 = r24
            r57 = r24
            r58 = r3
            r61 = r6
            r62 = r6
            r33.A06(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62)
            r0 = r31
            java.lang.Object r0 = r0.get(r9)
            X.8nh r0 = (X.C365798nh) r0
            X.A52 r3 = new X.A52
            r3.<init>(r0, r1)
            goto L_0x023f
        L_0x0546:
            r83 = 0
            if (r0 == 0) goto L_0x054c
            goto L_0x049b
        L_0x054c:
            r63 = r24
            if (r0 != 0) goto L_0x04a9
            r66 = r24
            goto L_0x04b2
        L_0x0554:
            r1 = r24
            goto L_0x046e
        L_0x0558:
            r80 = r24
            goto L_0x0464
        L_0x055c:
            r64 = r24
            goto L_0x045c
        L_0x0560:
            r3 = r24
            goto L_0x0442
        L_0x0564:
            com.instagram.common.session.UserSession r1 = r2.A0G
            java.lang.String r4 = r39.toString()
            java.lang.String r50 = "post_capture"
            X.0qQ.A0B(r1, r10)
            r1 = 15
            X.0qQ.A0B(r7, r1)
            r1 = 16
            X.0qQ.A0B(r4, r1)
            r3 = 20
            r1 = r18
            X.0qQ.A0B(r1, r3)
            java.lang.Boolean r49 = java.lang.Boolean.valueOf(r6)
            r32 = r43
            r33 = r59
            r34 = r19
            r35 = r24
            r36 = r24
            r37 = r7
            r38 = r24
            r39 = r0
            r40 = r21
            r41 = r24
            r42 = r22
            r43 = r20
            r44 = r24
            r45 = r24
            r46 = r24
            r47 = r5
            r48 = r24
            r51 = r30
            r52 = r24
            r53 = r24
            r54 = r4
            r55 = r24
            r56 = r1
            r57 = r24
            r58 = r24
            r59 = r24
            r61 = r6
            r62 = r6
            r32.A04(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62)
            r62 = r13
            r67 = r24
            r73 = r17
            r74 = r24
            r75 = r24
            r76 = r16
            r77 = r15
            r78 = r14
            r62.A02(r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84)
            goto L_0x0242
        L_0x05d4:
            r12 = 0
            goto L_0x0076
        L_0x05d7:
            com.instagram.pendingmedia.model.constants.ShareType r3 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_STORY_SHARE
            goto L_0x0022
        L_0x05db:
            java.lang.String r1 = "MultiMediaEditController"
            java.lang.String r0 = "No share target passed"
            X.0kD.A01(r1, r0)
            goto L_0x0625
        L_0x05e3:
            X.8QN r0 = r1.A02
            X.0eK r0 = r0.A0l
            java.lang.Object r0 = r0.get()
            X.8Wi r0 = (X.C357068Wi) r0
            if (r0 == 0) goto L_0x0630
            r0.A07()
            return
        L_0x05f3:
            if (r8 == 0) goto L_0x0608
            if (r12 == 0) goto L_0x0608
            com.instagram.common.session.UserSession r0 = r2.A0G
            X.S6X r13 = X.C394279xp.A00(r0)
            r14 = 5000(0x1388, double:2.4703E-320)
            java.lang.String r16 = "activity_result"
            r17 = r12
            r18 = r10
            r13.A01(r14, r16, r17, r18)
        L_0x0608:
            if (r60 == 0) goto L_0x061c
            com.instagram.common.session.UserSession r0 = r2.A0G
            X.OYk r4 = X.C63234Ktf.A00(r0)
            r3 = 31
            X.Plq r1 = new X.Plq
            r0 = r23
            r1.<init>(r3, r4, r0)
            X.C71012OYk.A01(r4, r1)
        L_0x061c:
            if (r27 == 0) goto L_0x0625
            X.ADt r0 = X.C39892ADt.A00(r21)
            X.AnonymousClass8QN.A04(r2, r0, r10)
        L_0x0625:
            X.80D r0 = r2.A0S
            boolean r0 = r0.A48
            if (r0 == 0) goto L_0x0631
            android.view.View r0 = r2.A0D
            r0.setVisibility(r6)
        L_0x0630:
            return
        L_0x0631:
            X.0eK r0 = r2.A0n
            java.lang.Object r0 = r0.get()
            X.8WK r0 = (X.AnonymousClass8WK) r0
            if (r0 == 0) goto L_0x0630
            r0.APW()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8QV.Du1(X.GnY):void");
    }

    public final void Du4() {
        this.A02.A0T.A06();
    }

    public final /* synthetic */ boolean EtH() {
        return false;
    }

    public final /* synthetic */ boolean getCanHaveEmptySegments() {
        return false;
    }
}
