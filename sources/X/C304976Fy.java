package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.instagram.common.typedurl.ImageUrl;
import java.lang.ref.WeakReference;

/* renamed from: X.6Fy  reason: invalid class name and case insensitive filesystem */
public final class C304976Fy {
    public AnonymousClass578 A00;
    public boolean A01;
    public final C284945Oz A02;
    public final C284945Oz A03;
    public final C284945Oz A04;
    public final C284945Oz A05;
    public final AnonymousClass0iw A06;
    public final C226572hI A07 = new C304986Fz(this);
    public final ImageUrl A08;
    public final C304966Fx A09;
    public final AnonymousClass6G0 A0A;
    public final boolean A0B;

    public C304976Fy(AnonymousClass0iw r5, ImageUrl imageUrl, C304966Fx r7, C62320sa r8, C62320sa r9, C62320sa r10, boolean z) {
        1z0 r0;
        0qQ.A0B(r5, 2);
        this.A08 = imageUrl;
        this.A06 = r5;
        this.A0B = z;
        this.A09 = r7;
        C284885Or r2 = C284885Or.A00;
        0qQ.A0C(r2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        AnonymousClass0eM r02 = C284905Ot.A01;
        this.A02 = new ParcelableSnapshotMutableState(r2, (Object) null);
        0qQ.A0C(r2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A04 = new ParcelableSnapshotMutableState(r2, r8);
        0qQ.A0C(r2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A05 = new ParcelableSnapshotMutableState(r2, r9);
        0qQ.A0C(r2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A03 = new ParcelableSnapshotMutableState(r2, r10);
        this.A0A = new AnonymousClass6G0(this);
        C62320sa r03 = (C62320sa) this.A04.getValue();
        if (r03 != null) {
            r03.invoke();
        }
        1NK A002 = 1NK.A00();
        ImageUrl imageUrl2 = this.A08;
        1OO A0J = A002.A0J(imageUrl2, this.A06.getModuleName());
        A0J.A02(this.A0A);
        A0J.A0J = true;
        A0J.A0B = new WeakReference(this.A07);
        A0J.A00().E5t();
        if (this.A0B && (r0 = 1zC.A00) != null) {
            r0.A04(imageUrl2);
        }
    }
}
