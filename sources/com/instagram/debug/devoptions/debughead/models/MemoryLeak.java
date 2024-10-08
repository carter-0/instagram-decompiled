package com.instagram.debug.devoptions.debughead.models;

import X.2Yu;
import X.AnonymousClass0Hd;
import X.AnonymousClass7TE;
import X.C41534Avc;
import X.C51966G9m;
import X.C66582MXn;
import X.T9C;
import android.content.Context;
import com.instagram.android.R;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MemoryLeak {
    public final List mActiveReferenceList;
    public final Set mAnalysisResultSet = AnonymousClass7TE.A1F();
    public AnalysisStatus mAnalysisStatus;
    public final List mAnalyzedReferenceList = AnonymousClass7TE.A1C();
    public final String mClassName;
    public int mCount;
    public final String mPath;
    public final List mQueuedReferenceList = AnonymousClass7TE.A1C();

    public enum AnalysisStatus {
        NO_OP,
        NOT_REQUESTED,
        REQUESTED,
        FAILED,
        COMPLETED,
        PARTIAL
    }

    /* renamed from: com.instagram.debug.devoptions.debughead.models.MemoryLeak$1  reason: invalid class name */
    public abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$instagram$debug$devoptions$debughead$models$MemoryLeak$AnalysisStatus;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0013 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0018 */
        static {
            /*
                com.instagram.debug.devoptions.debughead.models.MemoryLeak$AnalysisStatus[] r0 = com.instagram.debug.devoptions.debughead.models.MemoryLeak.AnalysisStatus.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                $SwitchMap$com$instagram$debug$devoptions$debughead$models$MemoryLeak$AnalysisStatus = r1
                com.instagram.debug.devoptions.debughead.models.MemoryLeak$AnalysisStatus r0 = com.instagram.debug.devoptions.debughead.models.MemoryLeak.AnalysisStatus.REQUESTED     // Catch:{ NoSuchFieldError -> 0x000e }
                X.C66581MXm.A1N(r0, r1)     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                com.instagram.debug.devoptions.debughead.models.MemoryLeak$AnalysisStatus r0 = com.instagram.debug.devoptions.debughead.models.MemoryLeak.AnalysisStatus.COMPLETED     // Catch:{ NoSuchFieldError -> 0x0013 }
                X.C51970G9q.A1M(r0, r1)     // Catch:{ NoSuchFieldError -> 0x0013 }
            L_0x0013:
                com.instagram.debug.devoptions.debughead.models.MemoryLeak$AnalysisStatus r0 = com.instagram.debug.devoptions.debughead.models.MemoryLeak.AnalysisStatus.PARTIAL     // Catch:{ NoSuchFieldError -> 0x0018 }
                X.C66581MXm.A1O(r0, r1)     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                com.instagram.debug.devoptions.debughead.models.MemoryLeak$AnalysisStatus r0 = com.instagram.debug.devoptions.debughead.models.MemoryLeak.AnalysisStatus.FAILED     // Catch:{ NoSuchFieldError -> 0x001d }
                X.Pxf.A1J(r0, r1)     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.debughead.models.MemoryLeak.AnonymousClass1.<clinit>():void");
        }
    }

    public void addActiveReference(Object obj, ReferenceQueue referenceQueue) {
        this.mActiveReferenceList.add(new WeakReference(obj, referenceQueue));
    }

    public void addAnalysisResult(T9C t9c) {
        this.mAnalysisResultSet.add(t9c);
    }

    public void clearNullReferences() {
        int A06 = C51966G9m.A06(this.mActiveReferenceList);
        int size = this.mQueuedReferenceList.size();
        while (true) {
            size--;
            if (A06 >= 0) {
                if (((Reference) this.mActiveReferenceList.get(A06)).get() == null) {
                    this.mActiveReferenceList.remove(A06);
                }
                if (size < 0) {
                    A06--;
                }
            } else if (size < 0) {
                return;
            }
            if (((Reference) this.mQueuedReferenceList.get(A06)).get() == null) {
                this.mQueuedReferenceList.remove(A06);
            }
            A06--;
        }
    }

    public int decrementCount() {
        int i = this.mCount - 1;
        this.mCount = i;
        return i;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.0Hd, java.util.ArrayList] */
    public AnonymousClass0Hd getActiveReferences() {
        return new ArrayList(this.mActiveReferenceList);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.HashSet, X.Avc] */
    public C41534Avc getAnalysisResults() {
        return new HashSet(this.mAnalysisResultSet);
    }

    public AnalysisStatus getAnalysisStatus() {
        return this.mAnalysisStatus;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.0Hd, java.util.ArrayList] */
    public AnonymousClass0Hd getAnalyzedReferences() {
        return new ArrayList(this.mAnalyzedReferenceList);
    }

    public String getClassName() {
        return this.mClassName;
    }

    public int getCount() {
        return this.mCount;
    }

    public WeakReference getLastAddedActiveReference() {
        return (WeakReference) C66582MXn.A0r(this.mActiveReferenceList);
    }

    public String getPath() {
        return this.mPath;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.0Hd, java.util.ArrayList] */
    public AnonymousClass0Hd getQueuedReferences() {
        return new ArrayList(this.mQueuedReferenceList);
    }

    public int getStatusColor(Context context) {
        int i;
        int ordinal = this.mAnalysisStatus.ordinal();
        if (ordinal == 2) {
            i = R.attr.igds_color_gradient_yellow;
        } else if (ordinal == 4) {
            return R.color.igds_active_badge;
        } else {
            if (ordinal == 5) {
                return R.color.igds_gradient_cyan;
            }
            i = R.attr.igds_color_gradient_red;
            if (ordinal != 3) {
                i = R.attr.igds_color_stroke;
            }
        }
        return 2Yu.A0H(context, i);
    }

    public void incrementCount() {
        this.mCount++;
    }

    public void moveReferencesBackFromQueued() {
        this.mActiveReferenceList.addAll(this.mQueuedReferenceList);
        this.mQueuedReferenceList.clear();
    }

    public void moveReferencesToAnalyzed() {
        this.mAnalyzedReferenceList.addAll(this.mQueuedReferenceList);
        this.mQueuedReferenceList.clear();
    }

    public void moveReferencesToQueued() {
        this.mQueuedReferenceList.addAll(this.mActiveReferenceList);
        this.mActiveReferenceList.clear();
    }

    public void setAnalysisStatus(AnalysisStatus analysisStatus) {
        this.mAnalysisStatus = analysisStatus;
    }

    public MemoryLeak(Object obj, String str, String str2, ReferenceQueue referenceQueue) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.mActiveReferenceList = A1C;
        A1C.add(new WeakReference(obj, referenceQueue));
        this.mPath = str;
        this.mClassName = str2;
        this.mAnalysisStatus = AnalysisStatus.NOT_REQUESTED;
        this.mCount = 1;
    }
}
