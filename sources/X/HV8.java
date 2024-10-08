package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import java.util.concurrent.TimeUnit;

public abstract class HV8 {
    public static final void A00(C286575Wy r22, Modifier modifier, Long l, String str, C62320sa r26, int i, int i2, boolean z) {
        int i3;
        String A14;
        C62320sa r11 = r26;
        Modifier modifier2 = modifier;
        String str2 = str;
        0qQ.A0B(str2, 0);
        C286575Wy r8 = r22;
        r8.ExV(-1683480512);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r8, str2) | i;
        } else {
            i3 = i5;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0Z(r8, z2);
        }
        Long l2 = l;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0Q(r8, l2);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i3 |= G9t.A0R(r8, modifier2);
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= 24576;
        } else if ((i5 & 24576) == 0) {
            i3 |= G9t.A0I(r8, r11);
        }
        if ((i3 & 9363) != 9362 || !r8.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                r11 = null;
            }
            if (0fL.A02()) {
                0fL.A01(-942383290, "com.instagram.barcelona.feed.post.ui.RepostedLabel (RepostedLabel.kt:19)");
            }
            Context A0I = C51968G9o.A0I(r8);
            if (z) {
                r8.ExS(693950215);
                A14 = C288035bG.A00(r8, 2131953727);
            } else {
                r8.ExS(694028769);
                A14 = C51968G9o.A14(r8, str2, 2131953717);
            }
            C51965G9l.A1X(r8, false);
            if (l != null) {
                long A0I2 = AnonymousClass7TG.A0I();
                long longValue = l2.longValue();
                long j = A0I2 - longValue;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                long minutes = timeUnit.toMinutes(j);
                long hours = timeUnit.toHours(j);
                if ((0 <= minutes && minutes < 60) || (1 <= hours && hours < 13)) {
                    0qQ.A0B(A0I, 0);
                    A14 = 002.A0T(A14, 1G0.A0E(AnonymousClass7TF.A0A(A0I), C247743gq.MINUTES, AnonymousClass05K.A01, (double) longValue, false, false), ' ');
                }
            }
            C54842HUz.A00(r8, modifier2, (C69316NjH) null, A14, (String) null, r11, (C62320sa) null, (0sL) null, R.drawable.instagram_reshare_pano_outline_24, (i3 & 7168) | ((i3 << 6) & 3670016), 436, false);
            if (0fL.A02()) {
                0fL.A00(-864920454);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JA7(l2, modifier2, r11, str2, i5, i4, 0, z2);
        }
    }
}
