package X;

import android.graphics.drawable.Drawable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.Vka  reason: case insensitive filesystem */
public final class C18052Vka {
    public final float A00;
    public final float A01;
    public final int A02;
    public final Drawable A03;
    public final C18041VkP A04;
    public final Integer A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C18052Vka) {
                C18052Vka vka = (C18052Vka) obj;
                if (!(0qQ.A0K(this.A03, vka.A03) && this.A02 == vka.A02 && Float.compare(this.A00, vka.A00) == 0 && Float.compare(this.A01, vka.A01) == 0 && this.A05 == vka.A05 && 0qQ.A0K(this.A04, vka.A04))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A002 = AnonymousClass7TF.A00(AnonymousClass7TF.A00(((AnonymousClass7TG.A0C(this.A03) * 31) + this.A02) * 31, this.A00), this.A01);
        int intValue = this.A05.intValue();
        switch (intValue) {
            case 1:
                str = "SHARK_FIN";
                break;
            case 2:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
            default:
                str = "DEFAULT";
                break;
        }
        return C51971G9r.A0F(str, intValue, A002) + AnonymousClass7TE.A0L(this.A04);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("TooltipAttributes(backgroundDrawable=");
        sb.append(this.A03);
        sb.append(AnonymousClass000.A00(839));
        sb.append(this.A02);
        sb.append(AnonymousClass000.A00(2003));
        sb.append(this.A00);
        sb.append(C66579MXk.A00(79));
        sb.append(this.A01);
        sb.append(", arrowType=");
        switch (this.A05.intValue()) {
            case 1:
                str = "SHARK_FIN";
                break;
            case 2:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
            default:
                str = "DEFAULT";
                break;
        }
        sb.append(str);
        sb.append(", shadow=");
        return AnonymousClass7TG.A0n(this.A04, sb);
    }

    public C18052Vka(Drawable drawable, C18041VkP vkP, Integer num, float f, float f2, int i) {
        this.A03 = drawable;
        this.A02 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A05 = num;
        this.A04 = vkP;
    }
}
