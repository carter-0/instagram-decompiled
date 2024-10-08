package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

public abstract class HcZ {
    public static final void A00(C286575Wy r18, C62320sa r19, int i, boolean z) {
        int i2;
        C62320sa r13 = r19;
        0qQ.A0B(r13, 1);
        C286575Wy r4 = r18;
        r4.ExV(-814457960);
        int i3 = i;
        if ((i & 112) == 0) {
            i2 = G9t.A0F(r4, r13) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 81) != 16 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(684585550, "com.instagram.schools.channels.ui.SchoolChannelsNullStateComponent (SchoolChannelsNullStateComponent.kt:19)");
            }
            I7M.A01(r4, C51966G9m.A0T(Modifier.A00), new C53512Gpi(R.drawable.instagram_illustrations_product_illustration_pi_plus_conversation, 144.0f), (HL5) null, (HL6) null, (CharSequence) null, (CharSequence) null, C288035bG.A00(r4, 2131972717), C288035bG.A00(r4, 2131956891), r13, (0sP) null, (0sP) null, 48, i2 & 112, 1524, 0);
            if (0fL.A02()) {
                0fL.A00(2110231808);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JGI.A01(ASQ, r13, i3, 14, z);
        }
    }
}
