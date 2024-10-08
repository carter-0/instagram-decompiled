package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.8Cl  reason: invalid class name and case insensitive filesystem */
public final class C352218Cl {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public long A0A;
    public long A0B;
    public Bitmap A0C;
    public C3496981j A0D = new C3496981j();
    public CameraAREffect A0E;
    public Medium A0F;
    public MediaUploadMetadata A0G = new MediaUploadMetadata((ImmersiveMediaFields) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false);
    public 0v6 A0H;
    public 0v6 A0I;
    public MusicOverlayStickerModel A0J;
    public AnonymousClass8GK A0K;
    public C352218Cl A0L;
    public C352218Cl A0M;
    public Boolean A0N;
    public Float A0O;
    public Float A0P;
    public Integer A0Q;
    public Integer A0R;
    public Integer A0S;
    public Integer A0T;
    public Integer A0U;
    public Integer A0V;
    public Long A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j = "";
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public List A0o;
    public List A0p;
    public List A0q;
    public List A0r;
    public List A0s;
    public Set A0t = new HashSet();
    public AnonymousClass2Q9 A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public boolean A17;
    public boolean A18;
    public boolean A19;
    public byte[] A1A;
    public byte[] A1B;
    public String A1C = "unset_file_path";

    public final void A0D(String str) {
        0qQ.A0B(str, 0);
        this.A1C = str;
        this.A0z = !str.equals("unset_file_path");
        List list = this.A0D.A00;
        0qQ.A07(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C363908kY r3 = (C363908kY) list.get(i);
            UserSession userSession = r3.A00;
            C352218Cl r1 = r3.A01;
            C255193tj.A02(userSession, new C363928ka(r1));
            r1.A0D.A02(r3);
        }
    }

    public final Rect A00() {
        int i = this.A03;
        if (i == 0 && this.A05 == 0 && this.A04 == 0 && this.A02 == 0) {
            return null;
        }
        return new Rect(i, this.A05, this.A04, this.A02);
    }

    public final MediaUploadMetadata A01() {
        MediaUploadMetadata mediaUploadMetadata;
        MediaUploadMetadata mediaUploadMetadata2 = this.A0G;
        Medium medium = this.A0F;
        if (medium != null) {
            mediaUploadMetadata = medium.A0G;
        } else {
            mediaUploadMetadata = null;
        }
        mediaUploadMetadata2.A01(mediaUploadMetadata);
        return mediaUploadMetadata2;
    }

    public final C352218Cl A02() {
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0A2 = AnonymousClass15o.A00.A0A(stringWriter);
            C363938kb.A00(A0A2, this);
            A0A2.close();
            return C363938kb.parseFromJson(16P.A00(stringWriter.toString()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r2.A19 == false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer A04() {
        /*
            r2 = this;
            boolean r0 = r2.A0y
            if (r0 == 0) goto L_0x0009
            boolean r0 = r2.A19
            r1 = 1
            if (r0 != 0) goto L_0x000a
        L_0x0009:
            r1 = 0
        L_0x000a:
            r0 = 0
            if (r1 == 0) goto L_0x001c
            X.0v6 r1 = r2.A0I
            if (r1 == 0) goto L_0x001c
            java.util.List r1 = r1.A02
            if (r1 == 0) goto L_0x001c
            r0 = 0
            java.lang.Object r0 = X.00k.A0O(r1, r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C352218Cl.A04():java.lang.Integer");
    }

    public final String A05() {
        String str = this.A0X;
        if (str != null) {
            return str;
        }
        CameraAREffect cameraAREffect = this.A0E;
        if (cameraAREffect != null) {
            return cameraAREffect.A0K;
        }
        return null;
    }

    public final String A06() {
        if (0qQ.A0K(this.A1C, "unset_file_path")) {
            if (this.A0u != null) {
                this.A1C = (String) C67351tA.A00(19B.A00, new C66184MGv((Object) this, (AnonymousClass4D7) null, 5));
            } else {
                0wb.A03("Photo.kt", "Photo file path is unset.");
            }
        }
        return this.A1C;
    }

    public final String A07() {
        String str = this.A0k;
        if (str == null) {
            str = (String) C67351tA.A00(19B.A00, new C66184MGv((Object) this, (AnonymousClass4D7) null, 6));
        }
        this.A0k = str;
        return str;
    }

    public final List A08() {
        List<LMH> list = this.A0p;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (LMH lmh : list) {
            arrayList.add(lmh.A00);
        }
        return arrayList;
    }

    public final List A09() {
        List<LMH> list = this.A0p;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (LMH lmh : list) {
            C59809JZd A002 = C59808JZc.A00(lmh.A00);
            if (A002 != null) {
                arrayList.add(A002);
            }
        }
        return arrayList;
    }

    public final List A0A() {
        C362088hK r0;
        List<LMH> list = this.A0p;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (LMH lmh : list) {
            0qQ.A0B(lmh, 0);
            int ordinal = lmh.A00.ordinal();
            if (ordinal == 15) {
                r0 = C362088hK.A09;
            } else if (ordinal == 115) {
                r0 = C362088hK.A0B;
            } else if (ordinal == 4) {
                r0 = C362088hK.A0A;
            }
            arrayList.add(r0);
        }
        return arrayList;
    }

    public final Set A0B() {
        Set set = this.A0t;
        ArrayList arrayList = new ArrayList();
        for (Object next : set) {
            0qQ.A0B(next, 0);
            Object obj = C391429sz.A01.get(next);
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return 00k.A0k(arrayList);
    }

    public final void A0C(Rect rect) {
        List A1P;
        int i = rect.left;
        if (i == 0 && rect.top == 0 && rect.right == 0 && rect.bottom == 0) {
            A1P = null;
        } else {
            A1P = 0sr.A1P(new Long[]{Long.valueOf((long) i), Long.valueOf((long) rect.top), Long.valueOf((long) rect.right), Long.valueOf((long) rect.bottom)});
        }
        this.A0q = A1P;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C352218Cl) || !00p.A0j(this.A0h, ((C352218Cl) obj).A0h, true)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A0h.hashCode();
    }

    public C352218Cl(Medium medium, int i, int i2) {
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        this.A0h = obj;
        this.A09 = i;
        this.A06 = i2;
        this.A0F = medium;
        this.A0I = 0oY.A01(medium.A0H, medium.A07);
        A0D(new File(medium.A0X).getAbsolutePath());
        this.A12 = true;
        this.A0A = medium.A0C * 1000;
        this.A0B = medium.A0D;
        this.A08 = medium.A0G.A0B ? 54 : 0;
        this.A0k = medium.A0X;
        this.A18 = true;
    }

    public final File A03() {
        return new File(A06());
    }

    public final boolean A0E() {
        List A092 = A09();
        if (A092 == null || !(!A092.isEmpty())) {
            return false;
        }
        return true;
    }

    public C352218Cl(File file, int i, int i2, long j, long j2, boolean z) {
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        this.A0h = obj;
        this.A09 = i;
        this.A06 = i2;
        this.A13 = z;
        this.A0A = j;
        this.A0B = j2;
        this.A08 = 1;
        this.A18 = true;
        if (file != null) {
            A0D(file.getAbsolutePath());
            this.A0k = A06();
        }
    }

    public C352218Cl() {
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        this.A0h = obj;
    }
}
