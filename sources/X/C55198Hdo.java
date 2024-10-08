package X;

import androidx.compose.ui.Modifier;
import com.instagram.wonderwall.model.WallPostItem;

/* renamed from: X.Hdo  reason: case insensitive filesystem */
public abstract class C55198Hdo {
    public static final void A00(C286575Wy r10, WallPostItem wallPostItem, 0sP r12, int i, int i2) {
        int i3;
        0qQ.A0B(wallPostItem, 0);
        C286575Wy r3 = r10;
        r10.ExV(1184731576);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r10, wallPostItem) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r10, r12);
        }
        if ((i3 & 19) != 18 || !r10.Bwn()) {
            if (i4 != 0) {
                r12 = null;
            }
            if (0fL.A02()) {
                0fL.A01(-1228158997, "com.instagram.wonderwall.ui.compose.components.RepostAttachmentPreview (WallRepostAttachment.kt:19)");
            }
            C55194Hdk.A00(r3, (Modifier) null, AnonymousClass5PI.A01(r10, JG3.A00(r12, wallPostItem, wallPostItem.BeB(), 32), 1290229571), 1.0f, 27696, 5, false, false);
            if (0fL.A02()) {
                0fL.A00(-1288948366);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            ASQ.A06 = GSJ.A01(r12, wallPostItem, i2, i, 39);
        }
    }
}
