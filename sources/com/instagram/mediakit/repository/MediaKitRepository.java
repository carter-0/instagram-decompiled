package com.instagram.mediakit.repository;

import X.02z;
import X.05G;
import X.0eP;
import X.0qQ;
import X.0sn;
import X.0u9;
import X.106;
import X.10b;
import X.1HR;
import X.1Hj;
import X.AnonymousClass0Ud;
import X.AnonymousClass0r6;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C249513ju;
import X.C60340gF;
import X.C61216Jz9;
import X.C61220JzD;
import X.C61221JzE;
import X.C66116MCa;
import X.C66404MQk;
import X.DbS;
import X.JTO;
import X.JTP;
import X.LDW;
import X.LFM;
import X.MP7;
import com.instagram.common.session.UserSession;
import com.instagram.mediakit.api.MediaKitApi;
import com.instagram.mediakit.repository.upload.MediaKitUploadApi;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class MediaKitRepository {
    public boolean A00;
    public final MediaKitApi A01;
    public final LFM A02;
    public final MediaKitUploadApi A03;
    public final AnonymousClass0r6 A04;
    public final AnonymousClass0r6 A05;
    public final 05G A06;
    public final 05G A07;
    public final 05G A08;
    public final 05G A09 = 106.A01((Object) null);
    public final AnonymousClass0Ud A0A;
    public final AnonymousClass0Ud A0B;
    public final AnonymousClass0Ud A0C;
    public final UserSession A0D;
    public final LDW A0E;
    public final C249513ju A0F;
    public final C249513ju A0G;

    public static final void A04(C61216Jz9 jz9, MediaKitRepository mediaKitRepository) {
        String str;
        C61221JzE jzE;
        String str2;
        C61221JzE jzE2;
        User user;
        C61221JzE jzE3;
        mediaKitRepository.A00 = false;
        LDW ldw = mediaKitRepository.A0E;
        String str3 = null;
        if (jz9 == null || (jzE3 = jz9.A00) == null) {
            str = null;
        } else {
            str = jzE3.A03;
        }
        ldw.A01 = str;
        LFM lfm = mediaKitRepository.A02;
        lfm.A00 = jz9;
        lfm.A01 = null;
        lfm.A02 = 0sn.A00;
        ArrayList arrayList = lfm.A04;
        arrayList.clear();
        if (jz9 != null) {
            C61221JzE jzE4 = jz9.A00;
            lfm.A01 = jzE4;
            lfm.A00(jzE4);
            lfm.A05.put(String.valueOf(jzE4.A03), jzE4);
            arrayList.addAll(jz9.A02);
        }
        mediaKitRepository.A08.Epw(jz9);
        mediaKitRepository.A09.Epw(jz9);
        05G r2 = mediaKitRepository.A07;
        if (jz9 != null) {
            jzE = jz9.A00;
        } else {
            jzE = null;
        }
        r2.Epw(lfm.A00(jzE));
        05G r3 = mediaKitRepository.A06;
        if (((0eP) r3.getValue()).A01 == null) {
            String str4 = mediaKitRepository.A0D.A06;
            C61221JzE A002 = A00(mediaKitRepository);
            if (A002 == null || (user = A002.A01) == null) {
                str2 = null;
            } else {
                str2 = user.getId();
            }
            if (0qQ.A0K(str4, str2)) {
                if (!(jz9 == null || (jzE2 = jz9.A00) == null)) {
                    str3 = jzE2.A03;
                }
                r3.Epw(AnonymousClass7TE.A1L(false, str3));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        if (r1 == r2) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0080, code lost:
        r1 = (X.C239803Ii) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0084, code lost:
        if ((r1 instanceof X.C239793Ih) == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0086, code lost:
        r5.A02.A01((X.C61108JxK) ((X.C239793Ih) r1).A00, (java.lang.String) null, (java.lang.String) null, (java.util.List) null);
        A05(r5);
        r5 = r5.A0G;
        r1 = X.AnonymousClass7TE.A0u();
        r3.A01 = null;
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a8, code lost:
        if ((r1 instanceof X.C297815sO) == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00aa, code lost:
        r1 = new X.C65439LtN((java.lang.String) ((X.C297815sO) r1).A00);
        r3.A01 = r5;
        r3.A00 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00be, code lost:
        if (A02(r1, r5, r3) != r2) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c0, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c8, code lost:
        r5 = r5.A0G;
        r1 = X.AnonymousClass7TE.A0u();
        r3.A01 = null;
        r0 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d7, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00dc, code lost:
        throw X.AnonymousClass7TE.A1K();
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A08(com.instagram.api.schemas.MediaKitVisibility r8, X.AnonymousClass4D7 r9) {
        /*
            r7 = this;
            r4 = 4
            boolean r0 = X.ME9.A03(r4, r9)
            if (r0 == 0) goto L_0x0024
            r3 = r9
            X.ME9 r3 = (X.ME9) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0024
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r3.A03
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r4 = 0
            switch(r0) {
                case 0: goto L_0x0029;
                case 1: goto L_0x003e;
                case 2: goto L_0x00d2;
                case 3: goto L_0x0079;
                case 4: goto L_0x00d2;
                case 5: goto L_0x00c1;
                case 6: goto L_0x00d2;
                default: goto L_0x001f;
            }
        L_0x001f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0024:
            X.ME9 r3 = X.ME9.A00(r7, r9, r4)
            goto L_0x0015
        L_0x0029:
            X.0eS.A00(r1)
            X.3ju r5 = r7.A0G
            r1 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.ME9.A01(r7, r8, r3, r1)
            java.lang.Object r0 = r5.ELH(r0, r3)
            if (r0 == r2) goto L_0x006c
            r5 = r7
            goto L_0x0049
        L_0x003e:
            java.lang.Object r8 = r3.A02
            com.instagram.api.schemas.MediaKitVisibility r8 = (com.instagram.api.schemas.MediaKitVisibility) r8
            java.lang.Object r5 = r3.A01
            com.instagram.mediakit.repository.MediaKitRepository r5 = (com.instagram.mediakit.repository.MediaKitRepository) r5
            X.0eS.A00(r1)
        L_0x0049:
            X.05G r0 = r5.A09
            java.lang.Object r0 = r0.getValue()
            X.Jz9 r0 = (X.C61216Jz9) r0
            if (r0 == 0) goto L_0x006d
            X.JzE r0 = r0.A00
            java.lang.String r0 = r0.A03
            java.lang.String r6 = java.lang.String.valueOf(r0)
            if (r6 == 0) goto L_0x006d
            com.instagram.mediakit.api.MediaKitApi r1 = r5.A01
            r3.A01 = r5
            r3.A02 = r4
            r0 = 3
            r3.A00 = r0
            java.lang.Object r1 = r1.A07(r8, r6, r3)
            if (r1 != r2) goto L_0x0080
        L_0x006c:
            return r2
        L_0x006d:
            X.3ju r5 = r5.A0G
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0u()
            r3.A01 = r4
            r3.A02 = r4
            r0 = 2
            goto L_0x009d
        L_0x0079:
            java.lang.Object r5 = r3.A01
            com.instagram.mediakit.repository.MediaKitRepository r5 = (com.instagram.mediakit.repository.MediaKitRepository) r5
            X.0eS.A00(r1)
        L_0x0080:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00a6
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r1 = r1.A00
            X.JxK r1 = (X.C61108JxK) r1
            X.LFM r0 = r5.A02
            r0.A01(r1, r4, r4, r4)
            A05(r5)
            X.3ju r5 = r5.A0G
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0u()
            r3.A01 = r4
            r0 = 4
        L_0x009d:
            r3.A00 = r0
            java.lang.Object r0 = r5.ELH(r1, r3)
            if (r0 != r2) goto L_0x00d5
            return r2
        L_0x00a6:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00d8
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r0 = r1.A00
            java.lang.String r0 = (java.lang.String) r0
            X.LtN r1 = new X.LtN
            r1.<init>(r0)
            r3.A01 = r5
            r0 = 5
            r3.A00 = r0
            java.lang.Object r0 = A02(r1, r5, r3)
            if (r0 != r2) goto L_0x00c8
            return r2
        L_0x00c1:
            java.lang.Object r5 = r3.A01
            com.instagram.mediakit.repository.MediaKitRepository r5 = (com.instagram.mediakit.repository.MediaKitRepository) r5
            X.0eS.A00(r1)
        L_0x00c8:
            X.3ju r5 = r5.A0G
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0u()
            r3.A01 = r4
            r0 = 6
            goto L_0x009d
        L_0x00d2:
            X.0eS.A00(r1)
        L_0x00d5:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x00d8:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mediakit.repository.MediaKitRepository.A08(com.instagram.api.schemas.MediaKitVisibility, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(X.C61220JzD r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            r3 = 2
            boolean r0 = X.ME9.A03(r3, r8)
            if (r0 == 0) goto L_0x005a
            r5 = r8
            X.ME9 r5 = (X.ME9) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005a
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r5.A03
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x003a
            if (r0 != r3) goto L_0x005f
            java.lang.Object r7 = r5.A02
            java.lang.Object r2 = r5.A01
            com.instagram.mediakit.repository.MediaKitRepository r2 = (com.instagram.mediakit.repository.MediaKitRepository) r2
            X.0eS.A00(r1)
        L_0x0029:
            X.LFM r1 = r2.A02
            r0 = 0
            X.0qQ.A0B(r7, r0)
            java.util.ArrayList r0 = r1.A04
            r0.add(r7)
            A05(r2)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x003a:
            X.0eS.A00(r1)
            X.LML r2 = X.LML.A02
            com.instagram.mediakit.model.MediaKitSectionType r1 = r7.A01
            com.instagram.mediakit.model.MediaKitSectionType r0 = com.instagram.mediakit.model.MediaKitSectionType.TEXT
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            r2.A01 = r0
            X.LtD r0 = new X.LtD
            r0.<init>(r2)
            X.ME9.A01(r6, r7, r5, r3)
            java.lang.Object r0 = A02(r0, r6, r5)
            if (r0 != r4) goto L_0x0058
            return r4
        L_0x0058:
            r2 = r6
            goto L_0x0029
        L_0x005a:
            X.ME9 r5 = X.ME9.A00(r6, r8, r3)
            goto L_0x0015
        L_0x005f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mediakit.repository.MediaKitRepository.A09(X.JzD, X.4D7):java.lang.Object");
    }

    public final void A0B(C61220JzD jzD, String str, boolean z) {
        0qQ.A0B(str, 0);
        ArrayList arrayList = this.A02.A04;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (!C61220JzD.A01(str, it)) {
                i++;
            } else if (i > -1) {
                arrayList.set(i, jzD);
            }
        }
        if (z) {
            A05(this);
        } else {
            this.A00 = true;
        }
    }

    public final boolean A0C(String str) {
        List list;
        0qQ.A0B(str, 0);
        C61216Jz9 jz9 = this.A02.A00;
        if (jz9 == null || (list = jz9.A02) == null) {
            list = 0sn.A00;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C61220JzD.A01(str, it)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final C61221JzE A00(MediaKitRepository mediaKitRepository) {
        C61216Jz9 jz9 = (C61216Jz9) mediaKitRepository.A09.getValue();
        if (jz9 != null) {
            return jz9.A00;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r1 == null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C61216Jz9 r4, com.instagram.mediakit.repository.MediaKitRepository r5, X.AnonymousClass4D7 r6) {
        /*
            com.instagram.mediakit.api.MediaKitApi r3 = r5.A01
            java.util.Map r2 = X.C63324Kv7.A00(r4)
            if (r4 == 0) goto L_0x0011
            X.JzE r0 = r4.A00
            if (r0 == 0) goto L_0x0011
            java.lang.String r1 = r0.A03
            r0 = 0
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            X.MCA r3 = r3.A06(r2, r0)
            boolean r2 = X.AnonymousClass7TF.A1V(r4)
            r1 = 0
            X.MCa r0 = new X.MCa
            r0.<init>(r1, r5, r2)
            java.lang.Object r1 = r3.collect(r0, r6)
            X.1Hj r0 = X.1Hj.A02
            if (r1 == r0) goto L_0x002a
            X.0gF r1 = X.C60340gF.A00
        L_0x002a:
            if (r1 == r0) goto L_0x002e
            X.0gF r1 = X.C60340gF.A00
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mediakit.repository.MediaKitRepository.A01(X.Jz9, com.instagram.mediakit.repository.MediaKitRepository, X.4D7):java.lang.Object");
    }

    public static final Object A02(C66404MQk mQk, MediaKitRepository mediaKitRepository, AnonymousClass4D7 r3) {
        return JTP.A0l(mediaKitRepository.A0F.ELH(mQk, r3));
    }

    public static final Object A03(MediaKitRepository mediaKitRepository, String str, AnonymousClass4D7 r6) {
        LFM lfm = mediaKitRepository.A02;
        C61221JzE jzE = (C61221JzE) lfm.A05.get(str);
        lfm.A01 = jzE;
        if (jzE != null) {
            A04(new C61216Jz9(jzE, (String) null, 0sn.A00), mediaKitRepository);
        }
        Object collect = mediaKitRepository.A01.A05(str).collect(new C66116MCa(0, mediaKitRepository, false), r6);
        1Hj r0 = 1Hj.A02;
        if (collect != r0) {
            collect = C60340gF.A00;
        }
        if (collect != r0) {
            return C60340gF.A00;
        }
        return collect;
    }

    public static final void A05(MediaKitRepository mediaKitRepository) {
        Object invoke;
        MP7 mp7 = new MP7(mediaKitRepository, 10);
        05G r1 = mediaKitRepository.A08;
        Object value = r1.getValue();
        if (!(value == null || (invoke = mp7.invoke(value)) == null)) {
            r1.Epw(invoke);
        }
        mediaKitRepository.A00 = false;
    }

    public final int A06(String str) {
        ArrayList arrayList = this.A02.A04;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (C61220JzD.A01(str, it)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        int intValue = Integer.valueOf(i).intValue();
        if (intValue <= -1) {
            return arrayList.size();
        }
        return intValue;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A07(android.content.Context r10, X.AnonymousClass4D7 r11) {
        /*
            r9 = this;
            r3 = 47
            boolean r0 = X.C66137MDp.A02(r3, r11)
            if (r0 == 0) goto L_0x00ac
            r6 = r11
            X.MDp r6 = (X.C66137MDp) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ac
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A02
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r7 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 == r4) goto L_0x002a
            if (r0 != r7) goto L_0x00b2
            X.0eS.A00(r1)
        L_0x0027:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x002a:
            java.lang.Object r8 = r6.A01
            com.instagram.mediakit.repository.MediaKitRepository r8 = (com.instagram.mediakit.repository.MediaKitRepository) r8
            X.0eS.A00(r1)
            goto L_0x006e
        L_0x0032:
            X.0eS.A00(r1)
            X.LFM r0 = r9.A02
            java.util.List r0 = r0.A02
            java.util.Iterator r3 = r0.iterator()
        L_0x003d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x006d
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.Jzx r0 = (X.C61264Jzx) r0
            java.lang.Integer r1 = r0.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x003d
            if (r2 == 0) goto L_0x006d
            X.1ud r1 = X.1ua.A0G
            com.instagram.common.session.UserSession r0 = r9.A0D
            X.1ua r3 = r1.A01(r10, r0)
            r6.A01 = r9
            r6.A00 = r4
            r2 = 0
            r1 = 17
            X.MGh r0 = new X.MGh
            r0.<init>(r9, r3, r2, r1)
            java.lang.Object r0 = X.19E.A00(r6, r0)
            if (r0 != r5) goto L_0x006d
            return r5
        L_0x006d:
            r8 = r9
        L_0x006e:
            r4 = 0
            r6.A01 = r4
            r6.A00 = r7
            X.LFM r3 = r8.A02
            java.util.List r0 = r3.A02
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r0.iterator()
        L_0x007f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0093
            java.lang.Object r0 = r1.next()
            X.Jzx r0 = (X.C61264Jzx) r0
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x007f
            r2.add(r0)
            goto L_0x007f
        L_0x0093:
            r3.A01(r4, r4, r4, r2)
            boolean r0 = r8.A00
            if (r0 == 0) goto L_0x009d
            A05(r8)
        L_0x009d:
            X.05G r0 = r8.A08
            java.lang.Object r0 = r0.getValue()
            X.Jz9 r0 = (X.C61216Jz9) r0
            java.lang.Object r0 = A01(r0, r8, r6)
            if (r0 != r5) goto L_0x0027
            return r5
        L_0x00ac:
            X.MDp r6 = X.C66137MDp.A00(r9, r11, r3)
            goto L_0x0016
        L_0x00b2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mediakit.repository.MediaKitRepository.A07(android.content.Context, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0A(X.AnonymousClass4D7 r7) {
        /*
            r6 = this;
            r3 = 45
            boolean r0 = X.C66137MDp.A02(r3, r7)
            if (r0 == 0) goto L_0x004b
            r5 = r7
            X.MDp r5 = (X.C66137MDp) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004b
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r5.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 != r2) goto L_0x0050
            java.lang.Object r1 = r5.A01
            X.LFM r1 = (X.LFM) r1
            X.0eS.A00(r4)
        L_0x0028:
            java.util.Collection r4 = (java.util.Collection) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.util.ArrayList r0 = r1.A03
            r0.clear()
            r0.addAll(r4)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0039:
            X.0eS.A00(r4)
            X.LFM r1 = r6.A02
            com.instagram.mediakit.api.MediaKitApi r0 = r6.A01
            r5.A01 = r1
            r5.A00 = r2
            java.lang.Object r4 = r0.A08(r5)
            if (r4 != r3) goto L_0x0028
            return r3
        L_0x004b:
            X.MDp r5 = X.C66137MDp.A00(r6, r7, r3)
            goto L_0x0016
        L_0x0050:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mediakit.repository.MediaKitRepository.A0A(X.4D7):java.lang.Object");
    }

    public MediaKitRepository(UserSession userSession, LDW ldw, MediaKitApi mediaKitApi, MediaKitUploadApi mediaKitUploadApi) {
        this.A0D = userSession;
        this.A01 = mediaKitApi;
        this.A0E = ldw;
        this.A03 = mediaKitUploadApi;
        1HR A1G = JTO.A1G(Integer.MAX_VALUE);
        this.A0F = A1G;
        this.A04 = 0u9.A04(A1G);
        1HR A1G2 = JTO.A1G(Integer.MAX_VALUE);
        this.A0G = A1G2;
        this.A05 = 0u9.A04(A1G2);
        02z A10 = DbS.A10(AnonymousClass7TE.A1L(AnonymousClass7TE.A0v(), (Object) null));
        this.A06 = A10;
        this.A0A = 10b.A03(A10);
        02z A012 = 106.A01((Object) null);
        this.A08 = A012;
        this.A0C = 10b.A03(A012);
        02z A1J = JTO.A1J();
        this.A07 = A1J;
        this.A0B = 10b.A03(A1J);
        this.A02 = new LFM();
    }
}
