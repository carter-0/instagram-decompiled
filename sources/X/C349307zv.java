package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.feed.media.CameraToolInfo;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.7zv  reason: invalid class name and case insensitive filesystem */
public final class C349307zv {
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
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public long A0L;
    public long A0M;
    public Bitmap A0N;
    public MediaComposition A0O;
    public CameraAREffect A0P;
    public AnonymousClass8J0 A0Q;
    public Medium A0R;
    public MediaUploadMetadata A0S;
    public 0v6 A0T;
    public 0v6 A0U;
    public MusicOverlayStickerModel A0V;
    public AnonymousClass8GK A0W;
    public C349307zv A0X;
    public Boolean A0Y;
    public Integer A0Z;
    public Integer A0a;
    public Integer A0b;
    public Integer A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public String A0q;
    public String A0r;
    public String A0s;
    public List A0t;
    public List A0u;
    public List A0v;
    public List A0w;
    public List A0x;
    public List A0y;
    public List A0z;
    public Set A10;
    public Set A11;
    public Set A12;
    public boolean A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public boolean A17;
    public boolean A18;
    public boolean A19;
    public boolean A1A;
    public boolean A1B;
    public boolean A1C;
    public boolean A1D;
    public boolean A1E;
    public boolean A1F;
    public boolean A1G;
    public boolean A1H;
    public boolean A1I;
    public boolean A1J;
    public boolean A1K;
    public boolean A1L;
    public final Integer A1M;

    public C349307zv(Medium medium, int i, int i2, int i3) {
        Medium medium2 = medium;
        0qQ.A0B(medium2, 4);
        this.A0k = "";
        this.A12 = new HashSet();
        this.A00 = 1;
        this.A0S = new MediaUploadMetadata((ImmersiveMediaFields) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false);
        this.A0K = i;
        this.A08 = i2;
        this.A09 = i3;
        this.A0R = medium2;
        this.A0k = new File(medium2.A0X).getAbsolutePath();
        this.A0U = 0oY.A01(medium2.A0H, medium2.A07);
        this.A0L = medium2.A0C * 1000;
        this.A0M = medium2.A0D;
        MediaUploadMetadata mediaUploadMetadata = medium2.A0G;
        this.A0S = mediaUploadMetadata;
        this.A0e = medium2.A0N;
        if (medium2.CeS()) {
            this.A07 = medium2.A03;
        }
        this.A0F = mediaUploadMetadata.A0B ? 54 : 0;
        this.A18 = true;
        this.A1H = true;
        this.A1M = null;
    }

    public final boolean equals(Object obj) {
        MediaComposition mediaComposition;
        if (obj == null || !(obj instanceof C349307zv) || ((mediaComposition = this.A0O) != null && !mediaComposition.equals(((C349307zv) obj).A0O))) {
            return false;
        }
        return 00p.A0j(A07(), ((C349307zv) obj).A07(), true);
    }

    public final long A00() {
        long length = new File(this.A0k).length();
        int i = this.A07;
        if (i == 0) {
            return 0;
        }
        return (length / ((long) i)) * 8000;
    }

    public final Rect A01() {
        int i = this.A03;
        if (i == 0 && this.A05 == 0 && this.A04 == 0 && this.A02 == 0) {
            return null;
        }
        return new Rect(i, this.A05, this.A04, this.A02);
    }

    public final MediaUploadMetadata A02() {
        MediaUploadMetadata mediaUploadMetadata;
        MediaUploadMetadata mediaUploadMetadata2 = this.A0S;
        Medium medium = this.A0R;
        if (medium != null) {
            mediaUploadMetadata = medium.A0G;
        } else {
            mediaUploadMetadata = null;
        }
        mediaUploadMetadata2.A01(mediaUploadMetadata);
        return mediaUploadMetadata2;
    }

    public final C349307zv A03() {
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0A2 = AnonymousClass15o.A00.A0A(stringWriter);
            C369998vf.A00(A0A2, this);
            A0A2.close();
            return C369998vf.parseFromJson(16P.A00(stringWriter.toString()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final Integer A04() {
        0v6 r1;
        List list;
        if (!this.A1K || (r1 = this.A0U) == null || (list = r1.A02) == null) {
            return null;
        }
        return (Integer) 00k.A0O(list, 0);
    }

    public final String A05() {
        String str = this.A0m;
        if (str != null) {
            return str;
        }
        CameraAREffect cameraAREffect = this.A0P;
        if (cameraAREffect != null) {
            return cameraAREffect.A0K;
        }
        return null;
    }

    public final String A06() {
        Medium medium = this.A0R;
        if (medium != null) {
            return medium.A0O;
        }
        return null;
    }

    public final String A07() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A0k);
        sb.append('_');
        sb.append(this.A0H);
        sb.append('_');
        sb.append(this.A06);
        return sb.toString();
    }

    public final HashSet A08() {
        HashSet hashSet = new HashSet();
        for (Object next : this.A12) {
            0qQ.A0B(next, 0);
            Object obj = C391429sz.A01.get(next);
            if (obj != null) {
                hashSet.add(obj);
            }
        }
        return hashSet;
    }

    public final void A09(int i, List list) {
        List list2;
        if (this.A0y == null) {
            this.A0y = new ArrayList();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraToolInfo cameraToolInfo = (CameraToolInfo) it.next();
            if (!(cameraToolInfo == null || (list2 = this.A0y) == null)) {
                list2.add(C63184Ksr.A00(cameraToolInfo, i));
            }
        }
    }

    public final int hashCode() {
        return A07().hashCode();
    }

    public C349307zv(File file, Integer num, String str, int i, int i2, int i3, long j, long j2, boolean z, boolean z2, boolean z3) {
        this.A0k = "";
        this.A12 = new HashSet();
        this.A00 = 1;
        int i4 = 0;
        this.A0S = new MediaUploadMetadata((ImmersiveMediaFields) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false);
        this.A0K = i;
        this.A08 = i2;
        this.A09 = i3;
        this.A0f = str;
        this.A1J = z;
        this.A0k = file.getAbsolutePath();
        this.A18 = z2;
        this.A0L = j;
        this.A0M = j2;
        this.A1H = z3;
        this.A0F = !z2 ? 1 : i4;
        this.A1M = num;
    }

    public C349307zv() {
        this.A0k = "";
        this.A12 = new HashSet();
        this.A00 = 1;
        this.A0S = new MediaUploadMetadata((ImmersiveMediaFields) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false);
        this.A1M = null;
    }
}
