package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* renamed from: X.KIv  reason: case insensitive filesystem */
public final class C61705KIv extends 0ng {
    public C63695L3f A00;
    public String A01;
    public final /* synthetic */ C64168LRo A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61705KIv(C64168LRo lRo, C63695L3f l3f, String str) {
        super(75, 2, false, true);
        this.A02 = lRo;
        this.A01 = str;
        this.A00 = l3f;
    }

    public final void run() {
        Bitmap decodeFile = BitmapFactory.decodeFile(this.A01, (BitmapFactory.Options) null);
        if (decodeFile != null) {
            C64168LRo lRo = this.A02;
            C59957JcO jcO = lRo.A07;
            C63695L3f l3f = this.A00;
            jcO.put(Integer.valueOf(l3f.A00), decodeFile);
            if (l3f.A01.get() != null) {
                lRo.A06.post(new M66(decodeFile, this));
            }
        }
    }
}
