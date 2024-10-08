package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.AKg  reason: case insensitive filesystem */
public final class C39940AKg implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass84J A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public C39940AKg(AnonymousClass84J r1, String str, boolean z, boolean z2) {
        this.A00 = r1;
        this.A01 = str;
        this.A03 = z;
        this.A02 = z2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass84J r4 = this.A00;
        String str = this.A01;
        boolean z = this.A03;
        Intent intent = new Intent("android.intent.action.VIEW", 0cp.A03(str));
        Context context = r4.A02;
        if (z) {
            AnonymousClass0b5.A01(context, intent);
        } else {
            AnonymousClass0b5.A02(context, intent);
        }
        if (this.A02 && (context instanceof TransparentModalActivity)) {
            ((ModalActivity) context).finish();
        }
    }
}
