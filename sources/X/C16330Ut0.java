package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;

/* renamed from: X.Ut0  reason: case insensitive filesystem */
public abstract class C16330Ut0 extends C16311Usf {
    public float A00;
    public VXD A01;
    public C18039VkN A02;
    public boolean A03;
    public final C17545VZy A04;

    public final XCG AML() {
        C19724WeQ usm;
        if (this.A03) {
            usm = new C16317Usl(this);
        } else {
            usm = new Usm(this);
        }
        usm.A01(this);
        return usm;
    }

    public void CMf(C17872VhP vhP) {
        C18039VkN vkN;
        String str;
        int i;
        int i2;
        boolean z;
        int i3;
        if (this.A06 == null) {
            C17872VhP vhP2 = vhP;
            super.CMf(vhP2);
            Context context = vhP2.A00;
            this.A00 = C13989Tnp.A03(context);
            C14261Tsj tsj = this.A04;
            if (tsj != null) {
                boolean A1V = AnonymousClass7TF.A1V(tsj.A01.get("aVelocity"));
                this.A03 = A1V;
                C14261Tsj tsj2 = this.A04;
                if (A1V) {
                    17k.A07(tsj2, "An error occurred while initializing brush. Cannot perform this action without initializing");
                    vkN = new C18039VkN(tsj2, 28);
                    vkN.A02(2, 5126, "aPosition", false, 0);
                    vkN.A02(2, 5126, "aVelocity", false, 8);
                    vkN.A02(1, 5126, "aTime", false, 16);
                    vkN.A02(1, 5126, "aSize", false, 20);
                    str = "aColor";
                    i = 4;
                    i2 = 5121;
                    z = true;
                    i3 = 24;
                } else {
                    17k.A07(tsj2, "An error occurred while initializing brush. Cannot perform this action without initializing");
                    vkN = new C18039VkN(tsj2, 20);
                    vkN.A02(2, 5126, "aPosition", false, 0);
                    vkN.A02(1, 5126, "aTime", false, 8);
                    vkN.A02(1, 5126, "aSize", false, 12);
                    str = "aColor";
                    i = 4;
                    i2 = 5121;
                    z = true;
                    i3 = 16;
                }
                vkN.A02(i, i2, str, z, i3);
                this.A02 = vkN;
                C17545VZy vZy = this.A04;
                if (vZy != null) {
                    vZy.A03 = new C17398VTz(tsj, this);
                    if (vZy.A02 == null) {
                        Thread currentThread = Thread.currentThread();
                        if (currentThread instanceof C20565Wui) {
                            vZy.A02 = (C20565Wui) currentThread;
                        }
                    }
                    Resources resources = context.getResources();
                    int i4 = vZy.A00;
                    Drawable drawable = resources.getDrawable(i4);
                    if (drawable instanceof C262364Dk) {
                        vZy.A04 = z;
                        ((C262364Dk) drawable).A01(new C64863LjP(i, drawable, vZy));
                    } else if (i4 != 0) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = false;
                        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i4, options);
                        decodeResource.getClass();
                        int A002 = C17545VZy.A00(decodeResource);
                        decodeResource.recycle();
                        vZy.A01 = A002;
                        C17398VTz vTz = vZy.A03;
                        if (vTz != null) {
                            vTz.A00.A02("sBrush", A002);
                        }
                    }
                }
            }
        }
    }

    public final boolean isValid() {
        C17545VZy vZy;
        if (!AnonymousClass7TF.A1V(this.A04) || (vZy = this.A04) == null) {
            return false;
        }
        if (vZy.A01 != 0 || vZy.A04) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.VZy, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1, types: [X.XAU, java.lang.Object] */
    public C16330Ut0(String str, int i, int i2, int i3) {
        super(str);
        this.A00 = i2;
        this.A01 = i;
        ? obj = new Object();
        obj.A01 = 0;
        obj.A04 = false;
        obj.A00 = i3;
        this.A04 = obj;
        this.A05 = new Object();
    }
}
