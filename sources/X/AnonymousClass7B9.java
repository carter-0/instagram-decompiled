package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.7B9  reason: invalid class name */
public final class AnonymousClass7B9 implements AnonymousClass7D2 {
    public final Context A00;
    public final AnonymousClass7XM A01;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        Context context = this.A00;
        AnonymousClass7XM r2 = this.A01;
        IgTextView findViewById = viewGroup.findViewById(R.id.direct_context_reply_context_info_text_view);
        0qQ.A07(findViewById);
        return new AnonymousClass7AR(context, findViewById, r2);
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r2, AnonymousClass7FW r3) {
        AnonymousClass7AR r22 = (AnonymousClass7AR) r2;
        C3266677r r32 = (C3266677r) r3;
        0qQ.A0B(r22, 0);
        0qQ.A0B(r32, 1);
        r22.A00(r32);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r3) {
        AnonymousClass7AR r32 = (AnonymousClass7AR) r3;
        0qQ.A0B(r32, 0);
        r32.A01.setVisibility(8);
    }

    public AnonymousClass7B9(Context context, AnonymousClass7XM r2) {
        this.A00 = context;
        this.A01 = r2;
    }
}
