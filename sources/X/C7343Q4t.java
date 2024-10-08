package X;

import java.io.File;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Q4t  reason: case insensitive filesystem */
public final class C7343Q4t implements C13835TiA {
    public final SNV A00;
    public final /* synthetic */ C12380SsU A01;

    public final void D0g(SJL sjl) {
        0qQ.A0B(sjl, 0);
        SNV snv = this.A00;
        synchronized (snv) {
            HashMap A1E = AnonymousClass7TE.A1E();
            S9T.A00(sjl, A1E);
            SNV.A00(snv, (S4C) null, (Exception) null, "media_upload_segmented_transcode_cancel", A1E, C13886Tj9.A00(snv.A01, snv.A00));
        }
        C12380SsU ssU = this.A01;
        synchronized (ssU) {
            if (ssU.A04 == AnonymousClass05K.A01) {
                ssU.A04 = AnonymousClass05K.A0C;
                C10939S1u s1u = ssU.A01;
                if (s1u != null) {
                    C13886Tj9 tj9 = s1u.A01;
                    C9596Rda.A00(tj9, (Exception) null, "media_upload_process_cancel", s1u.A02, C13886Tj9.A00(tj9, s1u.A00));
                }
                C13863Tij tij = ssU.A0J;
                tij.Dic();
                tij.DtJ();
            }
        }
    }

    public final void DDC(AnonymousClass4ZS r11, SJL sjl) {
        AnonymousClass4ZS r5 = r11;
        AnonymousClass7TG.A1N(r11, sjl);
        SNV snv = this.A00;
        synchronized (snv) {
            HashMap A1E = AnonymousClass7TE.A1E();
            S9T.A00(sjl, A1E);
            SNV.A00(snv, (S4C) null, r5, "media_upload_segmented_transcode_failure", A1E, C13886Tj9.A00(snv.A01, snv.A00));
        }
        C12380SsU ssU = this.A01;
        synchronized (ssU) {
            if (ssU.A04 == AnonymousClass05K.A01) {
                ssU.A04 = AnonymousClass05K.A0N;
                C10939S1u s1u = ssU.A01;
                if (s1u != null) {
                    s1u.A00(r11);
                    C13863Tij tij = ssU.A0J;
                    tij.Did(r11);
                    tij.DtL(r11);
                    C12380SsU.A03(ssU, r11);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.Object, X.S6z] */
    public final void DiZ(RF9 rf9, File file, int i, long j) {
        0qQ.A0B(file, 0);
        SNV snv = this.A00;
        String name = rf9.name();
        C12380SsU ssU = this.A01;
        synchronized (snv) {
            0qQ.A0B(name, 0);
            S4C s4c = new S4C(name, i);
            snv.A02.put(s4c, Long.valueOf(snv.A01.now()));
            SNV.A00(snv, s4c, (Exception) null, "media_upload_segmented_transcode_start", AnonymousClass7TE.A1E(), -1);
        }
        synchronized (ssU) {
            if (ssU.A04 == AnonymousClass05K.A01) {
                ? obj = new Object();
                obj.A05 = file;
                obj.A02 = -1;
                obj.A04 = rf9;
                obj.A06 = "video/mp4";
                obj.A03 = -1;
                obj.A00 = i;
                obj.A01 = j;
                ssU.A0R.add(obj);
                ssU.A0M.put(file, obj);
                C12380SsU.A02(ssU);
            }
        }
    }

    public final void onStart() {
    }

    public final void onSuccess() {
    }

    public C7343Q4t(SNV snv, C12380SsU ssU) {
        this.A01 = ssU;
        this.A00 = snv;
    }

    public final void DiX(RF9 rf9, float f) {
        C12380SsU ssU = this.A01;
        synchronized (ssU) {
            C7339Q4p q4p = ssU.A0E;
            if (rf9 != RF9.Audio) {
                q4p.A01 = f;
                C7339Q4p.A00(q4p);
            }
        }
    }

    public final void Dib(SRW srw, RF9 rf9, int i) {
        long j;
        SRW srw2;
        boolean z;
        IllegalStateException th;
        SNV snv = this.A00;
        String name = rf9.name();
        C12380SsU ssU = this.A01;
        synchronized (snv) {
            0qQ.A0B(name, 0);
            S4C s4c = new S4C(name, i);
            Long A0o = Pxe.A0o(s4c, snv.A02);
            if (A0o != null) {
                j = A0o.longValue();
            } else {
                j = 0;
            }
            HashMap A1E = AnonymousClass7TE.A1E();
            HashMap A1E2 = AnonymousClass7TE.A1E();
            srw2 = srw;
            A1E2.put("target_bit_rate", String.valueOf(srw2.A0I));
            A1E2.put("target_height", String.valueOf((long) srw2.A0B));
            A1E2.put("target_width", String.valueOf((long) srw2.A0D));
            A1E2.put("target_frame_rate", String.valueOf((long) srw2.A0A));
            A1E2.put("transcode_file_size", String.valueOf(srw2.A0G));
            z = srw2.A0O;
            A1E2.put("is_last_segment", String.valueOf(z));
            A1E2.put("segment_duration", String.valueOf(srw2.A0J));
            SJL sjl = srw2.A0L;
            String str = sjl.A0K;
            if (str != null) {
                A1E2.put("target_codec_profile", str);
            }
            String str2 = sjl.A0I;
            if (str2 != null) {
                A1E2.put("encoder_name", str2);
            }
            String str3 = sjl.A0H;
            if (str3 != null) {
                A1E2.put("decoder_name", str3);
            }
            A1E.putAll(A1E2);
            S9T.A00(sjl, A1E);
            SNV.A00(snv, s4c, (Exception) null, "media_upload_segmented_transcode_success", A1E, C13886Tj9.A00(snv.A01, j));
        }
        synchronized (ssU) {
            if (ssU.A04 == AnonymousClass05K.A01) {
                List<SRW> list = ssU.A0P;
                list.add(srw2);
                C13863Tij tij = ssU.A0J;
                tij.Die(srw2);
                HashMap hashMap = ssU.A0M;
                File file = srw2.A0N;
                Object obj = hashMap.get(file);
                if (obj != null) {
                    C11041S6z s6z = (C11041S6z) obj;
                    s6z.A02 = file.length();
                    ssU.A0O.add(s6z);
                    C12380SsU.A02(ssU);
                    if (z) {
                        try {
                            ssU.A00++;
                            C10939S1u s1u = ssU.A01;
                            if (s1u == null) {
                                throw AnonymousClass7TE.A0y();
                            } else if (ssU.A0Q.size() == ssU.A00) {
                                for (SRW srw3 : list) {
                                    if (srw3.A0M == C266714aE.VIDEO) {
                                        s1u.A02.put("target_color_space", S91.A00(srw3.A08));
                                    }
                                }
                                C13886Tj9 tj9 = s1u.A01;
                                C9596Rda.A00(tj9, (Exception) null, "media_upload_process_success", s1u.A02, C13886Tj9.A00(tj9, s1u.A00));
                                tij.DtR(ssU.A0D, ssU.A0F, list, true);
                                ssU.A0I.A07();
                            }
                        } catch (IllegalStateException e) {
                            C12380SsU.A03(ssU, e);
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    ssU.EKC();
                    Exception exc = ssU.A02;
                    if (ssU.A0Q.size() == ssU.A00 && exc != null) {
                        ssU.Dta(exc);
                    }
                } else {
                    th = AnonymousClass7TE.A0y();
                    throw th;
                }
            }
        }
    }
}
