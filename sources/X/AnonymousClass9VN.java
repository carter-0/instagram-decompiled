package X;

import com.google.common.collect.ImmutableList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.9VN  reason: invalid class name */
public final class AnonymousClass9VN extends 0ng {
    public final /* synthetic */ AnonymousClass9B4 A00;
    public final /* synthetic */ AnonymousClass3JC A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9VN(AnonymousClass9B4 r5, AnonymousClass3JC r6) {
        super(1132146482, 2, false, true);
        this.A00 = r5;
        this.A01 = r6;
    }

    public final void run() {
        AnonymousClass9VO r7;
        AnonymousClass9B4 r5 = this.A00;
        C290655fg r0 = r5.A07;
        AnonymousClass3JC r6 = this.A01;
        ReentrantReadWriteLock reentrantReadWriteLock = r0.A00;
        if (reentrantReadWriteLock.writeLock().tryLock(1, TimeUnit.SECONDS)) {
            try {
                AnonymousClass9VA r3 = (AnonymousClass9VA) r6.A01;
                if (!(r3 == null || (r7 = (AnonymousClass9VO) r3.getOptionalTreeField(0, "xfb_igd_search_nullstate_prompts", AnonymousClass9VO.class, -496976983)) == null)) {
                    AnonymousClass9B6 r32 = r5.A03;
                    r32.A00.A00();
                    ImmutableList requiredCompactedTreeListField = r7.getRequiredCompactedTreeListField(0, "nullstate_prompts", AnonymousClass9VP.class, -1524231350);
                    if (requiredCompactedTreeListField != null) {
                        11Z.A05("This operation can't be run on UI thread.");
                        0xY AR4 = r32.A01.AR4();
                        AR4.AHM();
                        AR4.E5c("last_sync_prompts_timestamp_sec", AnonymousClass7TG.A0I());
                        C249803kO it = requiredCompactedTreeListField.iterator();
                        0qQ.A07(it);
                        while (it.hasNext()) {
                            AnonymousClass9VP r10 = (AnonymousClass9VP) it.next();
                            String A0R = 002.A0R("prompt:", r10.getOptionalStringField(1, "prompt"));
                            StringBuilder sb = new StringBuilder();
                            sb.append((AnonymousClass9VQ) r10.getOptionalEnumField(0, "prompt_type", AnonymousClass9VQ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE));
                            sb.append(',');
                            sb.append(r10.getOptionalStringField(3, "prompt_fbid"));
                            sb.append(',');
                            sb.append(r10.getOptionalStringField(2, "emoji"));
                            AR4.E5g(A0R, sb.toString());
                        }
                        AR4.apply();
                    }
                    r5.A06 = false;
                    r5.A01 = r32.A00();
                }
            } catch (Throwable th) {
                reentrantReadWriteLock.writeLock().unlock();
                throw th;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return;
        }
        throw new InterruptedException("Failed to claim lock after 1 seconds");
    }
}
