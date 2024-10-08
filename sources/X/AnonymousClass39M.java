package X;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;

/* renamed from: X.39M  reason: invalid class name */
public final /* synthetic */ class AnonymousClass39M extends 03J implements 0sH {
    public static final AnonymousClass39M A00 = new AnonymousClass39M();

    public AnonymousClass39M() {
        super(6, AnonymousClass39N.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        AnonymousClass38C r4 = (AnonymousClass38C) obj2;
        AnonymousClass38N r8 = (AnonymousClass38N) obj3;
        WorkDatabase workDatabase = (WorkDatabase) obj4;
        AnonymousClass397 r7 = (AnonymousClass397) obj5;
        AnonymousClass39K r5 = (AnonymousClass39K) obj6;
        0qQ.A0B(context, 0);
        0qQ.A0B(r4, 1);
        0qQ.A0B(r8, 2);
        0qQ.A0B(workDatabase, 3);
        0qQ.A0B(r7, 4);
        0qQ.A0B(r5, 5);
        AnonymousClass39O r1 = new AnonymousClass39O(context, r4, workDatabase);
        AnonymousClass39T.A00(context, SystemJobService.class, true);
        AnonymousClass389.A00();
        return 0sr.A1P(new AnonymousClass39P[]{r1, new C2377539b(context, r4, r5, new AnonymousClass39Y(r5, r8), r7, r8)});
    }
}
