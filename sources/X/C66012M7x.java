package X;

import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeMentionSticker;
import java.util.Arrays;

/* renamed from: X.M7x  reason: case insensitive filesystem */
public final class C66012M7x implements Runnable {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ AnonymousClass6V6 A01;

    public C66012M7x(C255773uh r1, AnonymousClass6V6 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        C64113LOb lOb = this.A00.A0E;
        lOb.getClass();
        SuperlativeMentionSticker[] superlativeMentionStickerArr = (SuperlativeMentionSticker[]) this.A01.A00.toArray(new SuperlativeMentionSticker[0]);
        lOb.A00((SuperlativeMentionSticker[]) Arrays.copyOf(superlativeMentionStickerArr, superlativeMentionStickerArr.length));
    }
}
