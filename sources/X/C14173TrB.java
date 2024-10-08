package X;

import android.net.Uri;
import com.instagram.model.mediatype.ProductType;
import com.instagram.music.common.model.MusicDataSource;
import java.util.List;

/* renamed from: X.TrB  reason: case insensitive filesystem */
public final class C14173TrB implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Uri A03;
    public final /* synthetic */ MusicDataSource A04;
    public final /* synthetic */ C234492xx A05;
    public final /* synthetic */ AnonymousClass4M3 A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;

    public C14173TrB(Uri uri, MusicDataSource musicDataSource, C234492xx r3, AnonymousClass4M3 r4, String str, String str2, String str3, String str4, int i, int i2, int i3) {
        this.A06 = r4;
        this.A04 = musicDataSource;
        this.A05 = r3;
        this.A08 = str;
        this.A0A = str2;
        this.A01 = i;
        this.A00 = i2;
        this.A09 = str3;
        this.A07 = str4;
        this.A03 = uri;
        this.A02 = i3;
    }

    public final void run() {
        String str;
        String str2;
        AnonymousClass4M3 r4 = this.A06;
        Integer num = AnonymousClass05K.A15;
        MusicDataSource musicDataSource = this.A04;
        String str3 = musicDataSource.A03;
        if (str3 == null) {
            str3 = "MusicPlayer";
        }
        0qQ.A0B(str3, 2);
        C234492xx r2 = this.A05;
        String str4 = this.A08;
        String str5 = this.A0A;
        boolean z = true;
        boolean A1V = AnonymousClass7TF.A1V(r2.A02);
        int i = this.A01;
        int i2 = this.A00;
        if ((str4 == null || str4.length() == 0) && ((str2 = this.A09) == null || str2.length() == 0)) {
            z = false;
        }
        String str6 = str3;
        AnonymousClass3WR r10 = new AnonymousClass3WR((C2814057m) null, (ProductType) null, (C255573uM) null, (Boolean) null, (Double) null, num, 1, str6, (String) null, str5, str4, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, i, i2, -1, false, false, false, false, false, A1V, z, false);
        C263754Nf r8 = new C263754Nf(this.A07, (Object) musicDataSource);
        float f = r2.A00;
        AnonymousClass4DU r0 = r2.A0D;
        if (r0 == null || (str = r0.getModuleName()) == null) {
            str = "MusicPlayer";
        }
        r4.E4H(new C263794Nj((C242423Ua) null, new C263414Lx(false, false, false, false), r10, r8, String.valueOf(this.A03), str, f, 0, this.A02, false));
    }
}
