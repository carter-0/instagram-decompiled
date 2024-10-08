package X;

import android.view.View;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.Leq  reason: case insensitive filesystem */
public final class C64606Leq implements 1Qd {
    public final /* synthetic */ View A00;
    public final /* synthetic */ LN9 A01;
    public final /* synthetic */ AnonymousClass8N6 A02;
    public final /* synthetic */ C317466nJ A03;
    public final /* synthetic */ ByteArrayOutputStream A04;

    public final void onFailed(IOException iOException) {
    }

    public final void onNewData(ByteBuffer byteBuffer) {
        0qQ.A0B(byteBuffer, 0);
        JTU.A1I(this.A04, byteBuffer);
    }

    public final void onResponseStarted(2ZD r1) {
    }

    public C64606Leq(View view, LN9 ln9, AnonymousClass8N6 r3, C317466nJ r4, ByteArrayOutputStream byteArrayOutputStream) {
        this.A04 = byteArrayOutputStream;
        this.A02 = r3;
        this.A01 = ln9;
        this.A03 = r4;
        this.A00 = view;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [android.widget.ImageView, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public final void onComplete() {
        try {
            AnonymousClass8N6 r3 = this.A02;
            File A0s = JTO.A0s(r3.A0g.C4W(), 002.A0R(r3.A0k, "_webp"));
            JTO.A0t(A0s).write(this.A04.toByteArray());
            String absolutePath = A0s.getAbsolutePath();
            0qQ.A07(absolutePath);
            r3.A0D = null;
            C321016tR.A04(r3, absolutePath);
            LN9 ln9 = this.A01;
            C314236hs r32 = ln9.A01;
            if (r32 != null) {
                C317466nJ r2 = this.A03;
                r32.Cw2(ln9.A0A.getDrawable(), this.A00, r2);
            }
        } catch (IOException unused) {
        }
    }
}
