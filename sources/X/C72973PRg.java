package X;

import com.instagram.android.R;

/* renamed from: X.PRg  reason: case insensitive filesystem */
public final class C72973PRg implements C59554JOa {
    public final /* synthetic */ AnonymousClass2j8 A00;

    public C72973PRg(AnonymousClass2j8 r1) {
        this.A00 = r1;
    }

    public final void DYg(long j) {
        AnonymousClass2j8 r4 = this.A00;
        0xY A0p = AnonymousClass7TE.A0p(r4.A03);
        A0p.E5c("bg_fetch_schedule_target_ms", AnonymousClass7TG.A0I() + j);
        A0p.apply();
        AnonymousClass2j8.A02(r4, Integer.valueOf(R.id.background_prefetch_job_scheduler_id), "BackgroundPrefetchJobService", new C377289Lg(r4, j, 7), j);
    }
}
