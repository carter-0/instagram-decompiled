package X;

import android.graphics.drawable.Drawable;

public final class NPC extends AnonymousClass4AA {
    public final Drawable A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        NPC npc = (NPC) obj;
        if (!this.A02.equals(npc.A02) || !this.A01.equals(npc.A01) || this.A00 != npc.A00 || this.A03 != npc.A03) {
            return false;
        }
        return true;
    }

    public NPC(Drawable drawable, String str, String str2, boolean z) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = drawable;
        this.A03 = z;
    }
}
