package X;

import android.content.Context;
import androidx.fragment.app.Fragment;

public final class EHT extends 2Cn {
    public final Fragment A00;
    public final AnonymousClass8HT A01;
    public final 0sP A02;
    public final Context A03;
    public final AnonymousClass6ST A04;

    public EHT(Context context, Fragment fragment, AnonymousClass8HT r4, AnonymousClass6ST r5, 0sP r6) {
        AnonymousClass7TG.A0w(1, context, r5, r4);
        0qQ.A0B(r6, 5);
        this.A03 = context;
        this.A00 = fragment;
        this.A04 = r5;
        this.A01 = r4;
        this.A02 = r6;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        0qQ.A0B(obj, 0);
        if (C49103EpS.A00(this.A00)) {
            this.A01.A02("activity_destroyed-media_save_task_on_success");
        } else {
            this.A02.invoke(obj);
        }
    }

    public final void onFail(Exception exc) {
        if (!C49103EpS.A00(this.A00)) {
            AnonymousClass6ST r1 = this.A04;
            if (r1.isShowing()) {
                r1.dismiss();
            }
        }
        this.A01.A02("media_save_task_on_fail");
        C59689JTv.A0B(this.A03, "ReelMentionUploadCallback_something_went_wrong");
    }

    public final void onStart() {
        if (C49103EpS.A00(this.A00)) {
            this.A01.A02("activity_destroyed-media_save_task_on_start");
        } else {
            AnonymousClass0fN.A00(this.A04);
        }
    }
}
