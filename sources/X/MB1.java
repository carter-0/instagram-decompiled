package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.android.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.concurrent.Callable;

public final class MB1 implements Callable {
    public final /* synthetic */ IgdsListCell A00;
    public final /* synthetic */ C60599Jo8 A01;
    public final /* synthetic */ C65488LuC A02;
    public final /* synthetic */ Integer A03;

    public MB1(IgdsListCell igdsListCell, C60599Jo8 jo8, C65488LuC luC, Integer num) {
        this.A00 = igdsListCell;
        this.A03 = num;
        this.A01 = jo8;
        this.A02 = luC;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        Context context = this.A00.getContext();
        JTO.A1Z(context);
        AnonymousClass5Gt A0e = AnonymousClass7TG.A0e((Activity) context, this.A03.intValue());
        A0e.A0F = true;
        C60599Jo8 jo8 = this.A01;
        A0e.A03(AnonymousClass7TF.A0G(jo8.itemView, R.id.igds_textcell_title));
        A0e.A02();
        A0e.A0A = false;
        KSP.A00(A0e, this.A02, 10).A07(jo8.A00);
        return true;
    }
}
