package X;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.view.View;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.facebook.native_bridge.NativeDataPromise;
import com.facebook.papaya.client.type.PapayaRestrictions;
import com.facebook.papaya.fb.instagram.papaya.PapayaExecutionJobService;
import com.instagram.android.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class T0O implements 2IR {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public T0O(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onFailure(Throwable th) {
        switch (this.A00) {
            case 0:
                C308276Tl A0P = DbS.A0P();
                A0P.A01(0Yt.A0E());
                C299275ur.A00((C307896Rx) this.A01, A0P.A00(), (C277014uI) this.A02);
                return;
            case 1:
                ((NativeDataPromise) this.A02).setException(th.toString());
                return;
            case 2:
                ((C10193Ro9) this.A01).A00.remove(((TKV) this.A02).A02);
                return;
            case 5:
                ((C7274Q1y) this.A02).A00.remove(this.A01);
                return;
            case 6:
                return;
            default:
                JobService jobService = (JobService) this.A01;
                JobParameters jobParameters = (JobParameters) this.A02;
                if (th != null) {
                    0KC.A07(PapayaExecutionJobService.class, "Failed to run papaya", th, Pxe.A1b());
                }
                jobService.jobFinished(jobParameters, false);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        JobService jobService;
        JobParameters jobParameters;
        boolean z;
        long j;
        long j2;
        Object obj2;
        switch (this.A00) {
            case 0:
                C299275ur.A00((C307896Rx) this.A01, Pxj.A0a(obj), (C277014uI) this.A02);
                return;
            case 1:
                try {
                    ((NativeDataPromise) this.A02).setValue(obj);
                    return;
                } catch (Exception e) {
                    ((NativeDataPromise) this.A02).setException(e.toString());
                    return;
                }
            case 2:
                ((C10193Ro9) this.A01).A00.remove(((TKV) this.A02).A02);
                return;
            case 3:
                C10742RxL rxL = (C10742RxL) obj;
                if (rxL == null) {
                    jobService = (JobService) this.A01;
                    jobParameters = (JobParameters) this.A02;
                    z = false;
                    0KC.A07(PapayaExecutionJobService.class, "Failed to run papaya", AnonymousClass7TE.A0z("papaya is null"), new Object[0]);
                    break;
                } else {
                    PapayaExecutionJobService papayaExecutionJobService = (PapayaExecutionJobService) this.A01;
                    JobParameters jobParameters2 = (JobParameters) this.A02;
                    synchronized (papayaExecutionJobService) {
                        int jobId = jobParameters2.getJobId();
                        if (771751936 == (jobId & 771751936)) {
                            HashMap A1E = AnonymousClass7TE.A1E();
                            RFV rfv = RFV.DEVICE_IDLE_REQUIRED;
                            boolean z2 = true;
                            if (1 != (jobId & 1)) {
                                z2 = false;
                            }
                            long j3 = 1;
                            if (z2) {
                                j = 1;
                            } else {
                                j = 0;
                            }
                            Pxe.A1X(rfv, A1E, j);
                            RFV rfv2 = RFV.EXTERNAL_POWER_REQUIRED;
                            if (2 == (jobId & 2)) {
                                j2 = 1;
                            } else {
                                j2 = 0;
                            }
                            Pxe.A1X(rfv2, A1E, j2);
                            RFV rfv3 = RFV.WIFI_REQUIRED;
                            if (4 != (jobId & 4)) {
                                j3 = 0;
                            }
                            Pxe.A1X(rfv3, A1E, j3);
                            PapayaRestrictions papayaRestrictions = new PapayaRestrictions();
                            papayaRestrictions.A00.putAll(A1E);
                            papayaExecutionJobService.A00 = rxL;
                            ? obj3 = new Object();
                            rxL.A03.execute(new C13021TId(rxL, papayaRestrictions, obj3));
                            C255183ti.A04(new T0O(4, jobParameters2, papayaExecutionJobService), obj3, 1Lf.A01);
                        } else {
                            throw AnonymousClass7TE.A0w(String.format(Locale.ENGLISH, "0x%4x doesn't have a valid base mask!", new Object[]{Integer.valueOf(jobId)}));
                        }
                    }
                    return;
                }
            case 4:
                jobService = (JobService) this.A01;
                jobParameters = (JobParameters) this.A02;
                z = false;
                break;
            case 5:
                ((C7274Q1y) this.A02).A00.remove(this.A01);
                return;
            default:
                List list = (List) obj;
                if (list == null || list.isEmpty()) {
                    ((QJL) this.A01).A01.A00.A02.A00(false);
                    return;
                }
                boolean z3 = false;
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map Ae5 = ((BrowserExtensionsAutofillData) it.next()).Ae5();
                        InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall = (InstantExperiencesJSBridgeCall) this.A02;
                        if (instantExperiencesJSBridgeCall.A00("selectedAutoCompleteTag") != null) {
                            obj2 = instantExperiencesJSBridgeCall.A00("selectedAutoCompleteTag");
                            DbS.A1Y(obj2);
                        } else {
                            obj2 = "";
                        }
                        if (Ae5.containsKey(obj2)) {
                            z3 = true;
                        }
                    }
                }
                R8a r8a = ((QJL) this.A01).A01;
                C12752T5m t5m = new C12752T5m(this);
                View requireViewById = r8a.requireView().requireViewById(R.id.instant_experiences_autofill_bar);
                C12753T5n t5n = r8a.A00;
                t5n.A01.post(new C13067TJx(requireViewById, t5n, t5m, list));
                if (z3 && !r8a.A02) {
                    0xa A0q = AnonymousClass7TE.A0q(r8a.getSession());
                    if (A0q.getInt("ix_autofill_tooltip", 0) < 3) {
                        int i = A0q.getInt("ix_autofill_tooltip", 0);
                        0xY AR4 = A0q.AR4();
                        AR4.E5Z("ix_autofill_tooltip", i + 1);
                        AR4.apply();
                        r8a.requireView().postDelayed(new C51187Fpx(r8a), 1000);
                        return;
                    }
                    return;
                }
                return;
        }
        jobService.jobFinished(jobParameters, z);
    }
}
