package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.DirectAudioFallbackUrl;
import com.instagram.api.schemas.DirectAudioFallbackUrlImpl;
import com.instagram.feed.audio.Audio;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.47w  reason: invalid class name and case insensitive filesystem */
public abstract class C2610047w {
    public static Audio parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            Long l = null;
            Long l2 = null;
            DirectAudioFallbackUrlImpl directAudioFallbackUrlImpl = null;
            ArrayList arrayList = null;
            Integer num = null;
            while (r10.A1J() != 16L.A09) {
                String A0q = r10.A0q();
                r10.A1J();
                if ("audio_src".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("audio_src_expiration_timestamp_us".equals(A0q)) {
                    l = Long.valueOf(r10.A0y());
                } else if (TraceFieldType.Duration.equals(A0q)) {
                    l2 = Long.valueOf(r10.A0y());
                } else if ("fallback".equals(A0q)) {
                    directAudioFallbackUrlImpl = C2610147x.parseFromJson(r10);
                } else if ("waveform_data".equals(A0q)) {
                    if (r10.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r10.A1J() != 16L.A08) {
                            arrayList.add(new Float(r10.A0U()));
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("waveform_sampling_frequency_hz".equals(A0q)) {
                    num = Integer.valueOf(r10.A1D());
                }
                r10.A0z();
            }
            return new Audio(directAudioFallbackUrlImpl, num, l, l2, str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r3, Audio audio) {
        r3.A0c();
        String str = audio.A04;
        if (str != null) {
            r3.A0R("audio_src", str);
        }
        Long l = audio.A02;
        if (l != null) {
            r3.A0Q("audio_src_expiration_timestamp_us", l.longValue());
        }
        Long l2 = audio.A03;
        if (l2 != null) {
            r3.A0Q(TraceFieldType.Duration, l2.longValue());
        }
        DirectAudioFallbackUrl directAudioFallbackUrl = audio.A00;
        if (directAudioFallbackUrl != null) {
            r3.A0q("fallback");
            DirectAudioFallbackUrlImpl F2e = directAudioFallbackUrl.F2e();
            r3.A0c();
            String str2 = F2e.A00;
            if (str2 != null) {
                r3.A0R("audio_src", str2);
            }
            r3.A0Z();
        }
        List<Number> list = audio.A05;
        if (list != null) {
            16P.A03(r3, "waveform_data");
            for (Number number : list) {
                if (number != null) {
                    r3.A0f(number.floatValue());
                }
            }
            r3.A0Y();
        }
        Integer num = audio.A01;
        if (num != null) {
            r3.A0P("waveform_sampling_frequency_hz", num.intValue());
        }
        r3.A0Z();
    }
}
