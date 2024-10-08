package X;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;

/* renamed from: X.4QN  reason: invalid class name */
public final class AnonymousClass4QN implements AnonymousClass4QO {
    public final /* synthetic */ AnonymousClass4OS A00;
    public final /* synthetic */ AnonymousClass4PG A01;

    public AnonymousClass4QN(AnonymousClass4OS r1, AnonymousClass4PG r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void DS5(Metadata metadata, long j) {
        Metadata.Entry[] entryArr = metadata.A01;
        if (entryArr.length > 0) {
            Metadata.Entry entry = entryArr[0];
            if (entry instanceof EventMessage) {
                EventMessage eventMessage = (EventMessage) entry;
                this.A00.A0v.DNr(eventMessage.A03, eventMessage.A05, eventMessage.A02, j);
                return;
            }
            this.A00.A0v.DS6(metadata);
        }
    }
}
