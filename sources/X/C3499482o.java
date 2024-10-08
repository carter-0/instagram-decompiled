package X;

import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.viewmodel.GalleryGridFormat;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: X.82o  reason: invalid class name and case insensitive filesystem */
public final class C3499482o {
    public boolean A00 = false;
    public final AnonymousClass82Y A01;

    public final void A07(C365798nh r6) {
        Integer num;
        0qQ.A0B(r6, 0);
        AnonymousClass82Y r4 = this.A01;
        if (r4.A07()) {
            int i = r4.A00;
            r4.A06(i);
            List list = r4.A0m;
            list.add(i, r6);
            r4.A0o.add((Object) null);
            if (list.size() == 1) {
                num = AnonymousClass05K.A01;
            } else {
                num = AnonymousClass05K.A0C;
            }
            r4.A0B = num;
            r4.A00 = i;
            AnonymousClass82Y.A00(r4);
        }
    }

    public final void A08(Integer num) {
        0qQ.A0B(num, 0);
        this.A01.A0D = num;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r2.A02().A06 != X.AnonymousClass87I.A09) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(java.util.List r8) {
        /*
            r7 = this;
            r4 = 0
            X.0qQ.A0B(r8, r4)
            X.82Y r2 = r7.A01
            java.util.List r3 = r2.A0m
            r3.clear()
            r2.A00 = r4
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0050
            X.802 r0 = r2.A02()
            r6 = 1
            if (r0 == 0) goto L_0x0025
            X.802 r0 = r2.A02()
            X.87I r5 = r0.A06
            X.87I r0 = X.AnonymousClass87I.BIRTHDAY_HIGHLIGHTS
            r1 = 1
            if (r5 == r0) goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            int r0 = r8.size()
            if (r0 != r6) goto L_0x0096
            if (r1 != 0) goto L_0x0096
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x0030:
            r2.A0B = r0
            r3.addAll(r8)
            X.82b r0 = r2.A04
            if (r0 == 0) goto L_0x005d
            com.instagram.music.common.model.MusicOverlayStickerModel r5 = r0.A08
            if (r5 == 0) goto L_0x005d
        L_0x003d:
            java.lang.Object r2 = r3.get(r4)
            X.8nh r2 = (X.C365798nh) r2
            X.8nd r1 = r2.A05
            X.8nd r0 = X.C365758nd.A07
            if (r1 != r0) goto L_0x0051
            X.7zv r0 = r2.A03
            r0.getClass()
            r0.A0V = r5
        L_0x0050:
            return
        L_0x0051:
            X.8nd r0 = X.C365758nd.A04
            if (r1 != r0) goto L_0x0050
            X.8Cl r0 = r2.A02
            r0.getClass()
            r0.A0J = r5
            return
        L_0x005d:
            X.1Xj r0 = r2.A08
            if (r0 == 0) goto L_0x0050
            boolean r0 = r0.A5v()
            if (r0 == 0) goto L_0x0050
            X.1Xj r0 = r2.A08
            r0.getClass()
            r1 = 0
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = X.C271404in.A03(r1, r0, r1)
            if (r0 == 0) goto L_0x0050
            X.1Xj r0 = r2.A08
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = X.C271404in.A03(r1, r0, r1)
            if (r0 == 0) goto L_0x007f
            boolean r0 = r0.A0t
            if (r0 != 0) goto L_0x0050
        L_0x007f:
            X.1Xj r0 = r2.A08
            com.instagram.music.common.model.MusicOverlayStickerModel r2 = X.C271404in.A03(r1, r0, r1)
            r2.getClass()
            com.instagram.api.schemas.MusicProduct r1 = com.instagram.api.schemas.MusicProduct.MEMORY_RESHARE
            X.A9I r0 = new X.A9I
            r0.<init>(r2)
            r0.A02 = r1
            com.instagram.music.common.model.MusicOverlayStickerModel r5 = r0.A00()
            goto L_0x003d
        L_0x0096:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3499482o.A09(java.util.List):void");
    }

    public final C365798nh A00() {
        AnonymousClass82Y r0 = this.A01;
        C365798nh r02 = (C365798nh) r0.A0m.get(r0.A00);
        0qQ.A07(r02);
        return r02;
    }

    public final C365758nd A01() {
        C365758nd A012 = this.A01.A01();
        0qQ.A07(A012);
        return A012;
    }

    public final C365758nd A02() {
        C365758nd r0;
        C3498482b r1;
        AnonymousClass82Y r2 = this.A01;
        AnonymousClass82f r02 = r2.A0f;
        if ((r02 == null || !r02.A0D) && ((r1 = r2.A04) == null || !r1.A0F || !r1.A0G)) {
            r0 = r2.A01();
        } else {
            r0 = C365758nd.A07;
        }
        0qQ.A07(r0);
        return r0;
    }

    public final Integer A03() {
        C357638Yz r0 = this.A01.A0X;
        r0.getClass();
        Integer A08 = r0.A08();
        0qQ.A07(A08);
        return A08;
    }

    public final String A04() {
        String str;
        AnonymousClass82Y r2 = this.A01;
        if (!r2.A07()) {
            return "unknown";
        }
        C365798nh r3 = (C365798nh) r2.A0m.get(r2.A00);
        if (r3.A05.ordinal() != 0) {
            C349307zv r0 = r3.A03;
            r0.getClass();
            str = r0.A0f;
            if (str == null) {
                return "back";
            }
        } else {
            C352218Cl r02 = r3.A02;
            r02.getClass();
            if (r02.A0a == null) {
                return "back";
            }
            str = r3.A02.A0a;
        }
        str.getClass();
        return str;
    }

    public final List A05() {
        List unmodifiableList = Collections.unmodifiableList(this.A01.A0m);
        0qQ.A07(unmodifiableList);
        return unmodifiableList;
    }

    public final void A06() {
        AnonymousClass82Y r1 = this.A01;
        r1.A0F = UUID.randomUUID().toString();
        r1.A0b.A00.close();
        r1.A03 = null;
    }

    public final boolean A0A() {
        C3498982i r0 = this.A01.A0h;
        if (r0 == null || C379289Tg.CLIPS != r0.A02) {
            return false;
        }
        return true;
    }

    public final boolean A0B() {
        if (this.A01.A0f != null) {
            return true;
        }
        return false;
    }

    public final boolean A0C() {
        C3498982i r2 = this.A01.A0h;
        if (r2 != null && C379289Tg.CLIPS == r2.A02 && r2.A00 == AnonymousClass8JI.SEQUENTIAL_REMIX) {
            return true;
        }
        return false;
    }

    public final boolean A0D() {
        if (this.A01.A03 == GalleryGridFormat.LAYOUT) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        if (r0.A16 == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0E() {
        /*
            r7 = this;
            X.82Y r6 = r7.A01
            boolean r0 = r6.A0p
            r5 = 0
            if (r0 == 0) goto L_0x0037
            X.802 r4 = r6.A02()
            if (r4 == 0) goto L_0x0038
            X.87I r1 = r4.A06
            X.87I r0 = X.AnonymousClass87I.TEMPLATES
            if (r1 == r0) goto L_0x0017
            X.87I r0 = X.AnonymousClass87I.SHOUTOUT
            if (r1 != r0) goto L_0x0038
        L_0x0017:
            r3 = 1
        L_0x0018:
            X.82a r0 = r6.A0Z
            r2 = 0
            if (r0 == 0) goto L_0x001e
            r2 = 1
        L_0x001e:
            X.8Cl r0 = r6.A03()
            if (r0 == 0) goto L_0x0029
            boolean r0 = r0.A16
            r1 = 1
            if (r0 != 0) goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            if (r4 == 0) goto L_0x0030
            boolean r0 = r4.A0C
            if (r0 == 0) goto L_0x0037
        L_0x0030:
            if (r3 != 0) goto L_0x0037
            if (r2 != 0) goto L_0x0037
            if (r1 != 0) goto L_0x0037
            r5 = 1
        L_0x0037:
            return r5
        L_0x0038:
            r3 = 0
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3499482o.A0E():boolean");
    }

    public final boolean A0F() {
        if (this.A01.A04 != null) {
            return true;
        }
        return false;
    }

    public final boolean A0G() {
        if (this.A01.A0h != null) {
            return true;
        }
        return false;
    }

    public final boolean A0H() {
        AnonymousClass82Y r2 = this.A01;
        C3498982i r0 = r2.A0h;
        if (r0 == null || C379289Tg.STORY != r0.A02 || !"story_remix_reply".equals(r2.A0l)) {
            return false;
        }
        return true;
    }

    public final boolean A0I() {
        AnonymousClass802 A02;
        AnonymousClass82Y r3 = this.A01;
        if ((r3.A0D == AnonymousClass05K.A01 && r3.A0G == null) || (A02 = r3.A02()) == null || !r3.A08()) {
            return false;
        }
        return !A02.A0D;
    }

    public C3499482o(AnonymousClass82Y r2) {
        this.A01 = r2;
    }
}
