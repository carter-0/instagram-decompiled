package X;

import android.net.Uri;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: X.4YJ  reason: invalid class name */
public final class AnonymousClass4YJ implements C265994Xd {
    public C256683wB A00;
    public C265994Xd A01;
    public long A02;
    public final int A03;
    public final int A04;
    public final C256683wB A05;
    public final AnonymousClass4YK A06 = new AnonymousClass4YK();

    public final void FMe(Uri uri) {
    }

    public final void A00(C266084Xm r3, long j) {
        if (r3 == null) {
            this.A01 = this.A06;
            return;
        }
        this.A02 = j;
        C265994Xd FHW = r3.FHW(this.A03, this.A04);
        this.A01 = FHW;
        C256683wB r0 = this.A00;
        if (r0 != null) {
            FHW.AWP(r0);
        }
    }

    public final void AWP(C256683wB r66) {
        Metadata A002;
        String str;
        C256683wB r2 = r66;
        C256683wB r6 = this.A05;
        if (!(r6 == null || r2 == r6)) {
            String str2 = r2.A0W;
            2Kn.A00(str2);
            String str3 = r6.A0T;
            String str4 = r6.A0U;
            String str5 = str4;
            if (str4 == null) {
                str5 = r2.A0U;
            }
            String str6 = r2.A0V;
            String str7 = str6;
            if (str6 == null) {
                str7 = r6.A0V;
            }
            int i = r2.A04;
            int i2 = i;
            if (i == -1) {
                i2 = r6.A04;
            }
            int i3 = r2.A0D;
            if (i3 == -1) {
                i3 = r6.A0D;
            }
            String str8 = r2.A0R;
            if (str8 == null) {
                str8 = r6.A0R;
            }
            Metadata metadata = r2.A0P;
            Metadata metadata2 = r6.A0P;
            if (metadata == null) {
                A002 = metadata2;
            } else {
                A002 = metadata.A00(metadata2);
            }
            float f = r2.A01;
            if (f == -1.0f) {
                f = r6.A01;
            }
            int i4 = r2.A0H | r6.A0H;
            int i5 = r2.A0E | r6.A0E;
            DrmInitData drmInitData = r6.A0O;
            DrmInitData drmInitData2 = r2.A0O;
            ArrayList arrayList = new ArrayList();
            DrmInitData drmInitData3 = null;
            if (drmInitData != null) {
                str = drmInitData.A02;
                for (DrmInitData.SchemeData schemeData : drmInitData.A03) {
                    if (schemeData.A04 != null) {
                        arrayList.add(schemeData);
                    }
                }
            } else {
                str = null;
            }
            if (drmInitData2 != null) {
                if (str == null) {
                    str = drmInitData2.A02;
                }
                int size = arrayList.size();
                for (DrmInitData.SchemeData schemeData2 : drmInitData2.A03) {
                    if (schemeData2.A04 != null) {
                        UUID uuid = schemeData2.A03;
                        int i6 = 0;
                        while (true) {
                            if (i6 < size) {
                                if (((DrmInitData.SchemeData) arrayList.get(i6)).A03.equals(uuid)) {
                                    break;
                                }
                                i6++;
                            } else {
                                arrayList.add(schemeData2);
                                break;
                            }
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                drmInitData3 = new DrmInitData(str, (DrmInitData.SchemeData[]) arrayList.toArray(new DrmInitData.SchemeData[0]), false);
            }
            String str9 = r2.A0S;
            int i7 = r2.A0B;
            List list = r2.A0X;
            long j = r2.A0M;
            int i8 = r2.A0L;
            int i9 = r2.A0A;
            int i10 = r2.A0F;
            float f2 = r2.A02;
            byte[] bArr = r2.A0Y;
            int i11 = r2.A0I;
            ColorInfo colorInfo = r2.A0Q;
            int i12 = r2.A06;
            int i13 = r2.A0G;
            int i14 = r2.A0C;
            int i15 = r2.A08;
            int i16 = r2.A09;
            int i17 = r2.A03;
            int i18 = r2.A0J;
            int i19 = r2.A0K;
            int i20 = r2.A07;
            C256673wA r10 = r2.A0N;
            if (drmInitData3 != null && i20 == 0) {
                i20 = 2;
            }
            String str10 = r10.A07;
            boolean z = r10.A0H;
            boolean z2 = r10.A0I;
            boolean z3 = r10.A0E;
            boolean z4 = r10.A0D;
            boolean z5 = r10.A0C;
            boolean z6 = r10.A0B;
            boolean z7 = r10.A0A;
            boolean z8 = r10.A09;
            boolean z9 = r10.A0J;
            String str11 = r10.A05;
            String str12 = r10.A06;
            String str13 = r10.A04;
            String str14 = r10.A08;
            boolean z10 = r10.A0G;
            int i21 = r10.A01;
            boolean z11 = r10.A0F;
            boolean z12 = r10.A0K;
            String str15 = r10.A03;
            C256673wA r15 = r6.A0N;
            String str16 = r15.A02;
            if (str11 == null) {
                str11 = r15.A05;
            }
            if (str13 == null) {
                str13 = r15.A04;
            }
            if (str14 == null) {
                str14 = r15.A08;
            }
            if (str10 == null) {
                str10 = r15.A07;
            }
            r2 = new C256683wB(new C256673wA(str16, str15, str13, str11, str12, str10, str14, i21, z8, z7, z6, z5, z4, z3, z11, z10, z, z2, z9, z12), drmInitData3, A002, colorInfo, str8, str9, str3, str5, str7, str2, list, bArr, f, f2, i17, i2, i12, i20, i15, i16, i9, i7, i14, i3, i5, i10, i13, i4, i11, i18, i19, i8, j);
        }
        this.A00 = r2;
        this.A01.AWP(r2);
    }

    public final /* synthetic */ void EJh(AnonymousClass4XV r2, int i) {
        this.A01.EJh(r2, i);
    }

    public final void EJi(AnonymousClass4XV r2, int i, int i2) {
        this.A01.EJh(r2, i);
    }

    public final int EJl(C257123wt r3, int i, int i2, boolean z) {
        return this.A01.EJl(r3, i, 0, z);
    }

    public final void EJn(C266034Xh r8, int i, int i2, int i3, long j) {
        long j2 = this.A02;
        long j3 = j;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.A01 = this.A06;
        }
        this.A01.EJn(r8, i, i2, i3, j3);
    }

    public AnonymousClass4YJ(C256683wB r2, int i, int i2) {
        this.A03 = i;
        this.A04 = i2;
        this.A05 = r2;
    }
}
