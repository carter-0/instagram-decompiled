package X;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import com.google.common.collect.ImmutableList;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: X.Sem  reason: case insensitive filesystem */
public final class C11689Sem implements C13809Thc {
    public int A00;
    public int A01;
    public int A02;
    public long A03 = -1;
    public YBZ A04;
    public C11698Sev A05;
    public MotionPhotoMetadata A06;
    public C11697Seu A07;
    public C13910TlA A08;
    public final C11389SRd A09 = Pxe.A0P(6);

    public final /* synthetic */ C13809Thc CBL() {
        return this;
    }

    public final void CMU(YBZ ybz) {
        this.A04 = ybz;
    }

    public final int E67(C13910TlA tlA, C21363XYr xYr) {
        int i;
        String A0F;
        long j;
        String str;
        String str2;
        long j2;
        long j3;
        int i2 = this.A02;
        C13910TlA tlA2 = tlA;
        if (i2 == 0) {
            C11389SRd sRd = this.A09;
            sRd.A0M(2);
            tlA2.readFully(sRd.A02, 0, 2);
            int A082 = sRd.A08();
            this.A00 = A082;
            if (A082 == 65498) {
                if (this.A03 != -1) {
                    i = 4;
                }
                YBZ ybz = this.A04;
                ybz.getClass();
                ybz.ASU();
                C11710Sf7.A00(this.A04, -9223372036854775807L);
                i = 6;
            } else {
                if (A082 >= 65488) {
                    if (A082 <= 65497) {
                        return 0;
                    }
                } else if (A082 == 65281) {
                    return 0;
                }
                i = 1;
            }
        } else if (i2 == 1) {
            C11389SRd sRd2 = this.A09;
            i = 2;
            sRd2.A0M(2);
            tlA2.readFully(sRd2.A02, 0, 2);
            this.A01 = sRd2.A08() - 2;
        } else if (i2 != 2) {
            C21363XYr xYr2 = xYr;
            if (i2 == 4) {
                long Bdl = tlA2.Bdl();
                long j4 = this.A03;
                if (Bdl != j4) {
                    xYr2.A00 = j4;
                    return 1;
                }
                if (tlA2.E2G(this.A09.A02, 0, 1, true)) {
                    tlA2.EI7();
                    if (this.A07 == null) {
                        this.A07 = new C11697Seu(C13890TjD.A00, 8);
                    }
                    C11698Sev sev = new C11698Sev(tlA2, this.A03);
                    this.A05 = sev;
                    if (this.A07.Evx(sev)) {
                        C11697Seu seu = this.A07;
                        long j5 = this.A03;
                        YBZ ybz2 = this.A04;
                        ybz2.getClass();
                        seu.CMU(new C11702Sez(ybz2, j5));
                        MotionPhotoMetadata motionPhotoMetadata = this.A06;
                        motionPhotoMetadata.getClass();
                        YBZ ybz3 = this.A04;
                        ybz3.getClass();
                        C13900TjN FHV = ybz3.FHV(1024, 4);
                        SOW A002 = SOW.A00();
                        A002.A0S = SQX.A02("image/jpeg");
                        A002.A0P = new Metadata(motionPhotoMetadata);
                        C13900TjN.A00(A002, FHV);
                        i = 5;
                    }
                }
                YBZ ybz4 = this.A04;
                ybz4.getClass();
                ybz4.ASU();
                C11710Sf7.A00(this.A04, -9223372036854775807L);
                i = 6;
            } else if (i2 == 5) {
                if (this.A05 == null || tlA2 != this.A08) {
                    this.A08 = tlA2;
                    this.A05 = new C11698Sev(tlA2, this.A03);
                }
                C11697Seu seu2 = this.A07;
                seu2.getClass();
                int E67 = seu2.E67(this.A05, xYr2);
                if (E67 != 1) {
                    return E67;
                }
                xYr2.A00 += this.A03;
                return E67;
            } else if (i2 == 6) {
                return -1;
            } else {
                throw Pxe.A0i();
            }
        } else {
            if (this.A00 == 65505) {
                int i3 = this.A01;
                C11389SRd A0P = Pxe.A0P(i3);
                tlA2.readFully(A0P.A02, 0, i3);
                if (this.A06 == null && "http://ns.adobe.com/xap/1.0/".equals(A0P.A0F()) && (A0F = A0P.A0F()) != null) {
                    long length = tlA2.getLength();
                    MotionPhotoMetadata motionPhotoMetadata2 = null;
                    if (length != -1) {
                        try {
                            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                            newPullParser.setInput(new StringReader(A0F));
                            newPullParser.next();
                            if (SKA.A02("x:xmpmeta", newPullParser)) {
                                long j6 = -9223372036854775807L;
                                ImmutableList of = ImmutableList.of();
                                loop0:
                                while (true) {
                                    newPullParser.next();
                                    if (!SKA.A02("rdf:Description", newPullParser)) {
                                        if (SKA.A02("Container:Directory", newPullParser)) {
                                            str = "Container";
                                            str2 = "Item";
                                        } else if (SKA.A02("GContainer:Directory", newPullParser)) {
                                            str = "GContainer";
                                            str2 = "GContainerItem";
                                        }
                                        ImmutableList.Builder builder = ImmutableList.builder();
                                        String A0R = 002.A0R(str, ":Item");
                                        String A0R2 = 002.A0R(str, ":Directory");
                                        while (true) {
                                            newPullParser.next();
                                            if (SKA.A02(A0R, newPullParser)) {
                                                String A0R3 = 002.A0R(str2, ":Mime");
                                                String A0R4 = 002.A0R(str2, ":Semantic");
                                                String A0R5 = 002.A0R(str2, ":Length");
                                                String A0R6 = 002.A0R(str2, ":Padding");
                                                String A003 = SKA.A00(A0R3, newPullParser);
                                                String A004 = SKA.A00(A0R4, newPullParser);
                                                String A005 = SKA.A00(A0R5, newPullParser);
                                                String A006 = SKA.A00(A0R6, newPullParser);
                                                if (A003 == null || A004 == null) {
                                                    of = ImmutableList.of();
                                                } else {
                                                    if (A005 != null) {
                                                        j2 = Long.parseLong(A005);
                                                    } else {
                                                        j2 = 0;
                                                    }
                                                    if (A006 != null) {
                                                        j3 = Long.parseLong(A006);
                                                    } else {
                                                        j3 = 0;
                                                    }
                                                    builder.add(new C10510RtP(j2, A003, j3));
                                                }
                                            }
                                            if (SKA.A01(A0R2, newPullParser)) {
                                                of = builder.build();
                                                break;
                                            }
                                        }
                                    } else {
                                        String[] strArr = C10109Rml.A02;
                                        int i4 = 0;
                                        while (true) {
                                            String A007 = SKA.A00(strArr[i4], newPullParser);
                                            if (A007 != null) {
                                                if (Integer.parseInt(A007) != 1) {
                                                    break;
                                                }
                                                String[] strArr2 = C10109Rml.A01;
                                                int i5 = 0;
                                                while (true) {
                                                    j6 = -9223372036854775807L;
                                                    if (i5 >= 4) {
                                                        break;
                                                    }
                                                    String A008 = SKA.A00(strArr2[i5], newPullParser);
                                                    if (A008 != null) {
                                                        long parseLong = Long.parseLong(A008);
                                                        if (parseLong != -1) {
                                                            j6 = parseLong;
                                                        }
                                                    } else {
                                                        i5++;
                                                    }
                                                }
                                                String[] strArr3 = C10109Rml.A00;
                                                int i6 = 0;
                                                while (true) {
                                                    String A009 = SKA.A00(strArr3[i6], newPullParser);
                                                    if (A009 == null) {
                                                        i6++;
                                                        if (i6 >= 2) {
                                                            of = ImmutableList.of();
                                                            break;
                                                        }
                                                    } else {
                                                        of = ImmutableList.of(new C10510RtP(0, "image/jpeg", 0), new C10510RtP(Long.parseLong(A009), "video/mp4", 0));
                                                        break;
                                                    }
                                                }
                                            } else {
                                                i4++;
                                                if (i4 >= 4) {
                                                    break loop0;
                                                }
                                            }
                                        }
                                    }
                                    if (SKA.A01("x:xmpmeta", newPullParser)) {
                                        if (!of.isEmpty() && of.size() >= 2) {
                                            int A062 = C51966G9m.A06(of);
                                            long j7 = -1;
                                            long j8 = -1;
                                            long j9 = -1;
                                            long j10 = -1;
                                            boolean z = false;
                                            while (true) {
                                                if (A062 < 0) {
                                                    break;
                                                }
                                                C10510RtP rtP = (C10510RtP) of.get(A062);
                                                boolean equals = "video/mp4".equals(rtP.A02) | z;
                                                if (A062 == 0) {
                                                    j = length - rtP.A01;
                                                    length = 0;
                                                } else {
                                                    j = length;
                                                    length -= rtP.A00;
                                                }
                                                if (!equals || length == j) {
                                                    z = equals;
                                                } else {
                                                    j10 = j - length;
                                                    j9 = length;
                                                    z = false;
                                                }
                                                if (A062 == 0) {
                                                    j7 = length;
                                                    j8 = j;
                                                    break;
                                                }
                                                A062--;
                                            }
                                            if (j9 != -1 && j10 != -1 && j7 != -1 && j8 != -1) {
                                                motionPhotoMetadata2 = new MotionPhotoMetadata(j7, j8, j6, j9, j10);
                                            }
                                        }
                                    }
                                }
                            } else {
                                throw new XQX("Couldn't find xmp metadata", (Throwable) null, 1, true);
                            }
                        } catch (XQX | NumberFormatException | XmlPullParserException unused) {
                            STH.A03("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        }
                    }
                    this.A06 = motionPhotoMetadata2;
                    if (motionPhotoMetadata2 != null) {
                        this.A03 = motionPhotoMetadata2.A04;
                    }
                }
            } else {
                tlA2.Evk(this.A01);
            }
            this.A02 = 0;
            return 0;
        }
        this.A02 = i;
        return 0;
    }

    public final void EKu(long j, long j2) {
        if (j == 0) {
            this.A02 = 0;
            this.A07 = null;
        } else if (this.A02 == 5) {
            C11697Seu seu = this.A07;
            seu.getClass();
            seu.EKu(j, j2);
        }
    }

    public final boolean Evx(C13910TlA tlA) {
        C11389SRd sRd = this.A09;
        sRd.A0M(2);
        tlA.E2F(sRd.A02, 0, 2);
        if (sRd.A08() != 65496) {
            return false;
        }
        C13910TlA.A00(sRd, tlA, 2);
        int A082 = sRd.A08();
        this.A00 = A082;
        if (A082 == 65504) {
            C13910TlA.A00(sRd, tlA, 2);
            tlA.AAu(sRd.A08() - 2);
            C13910TlA.A00(sRd, tlA, 2);
            A082 = sRd.A08();
            this.A00 = A082;
        }
        if (A082 != 65505) {
            return false;
        }
        tlA.AAu(2);
        C13910TlA.A00(sRd, tlA, 6);
        if (sRd.A0C() == 1165519206 && sRd.A08() == 0) {
            return true;
        }
        return false;
    }
}
