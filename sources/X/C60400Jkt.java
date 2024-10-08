package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.ArrayList;

/* renamed from: X.Jkt  reason: case insensitive filesystem */
public final class C60400Jkt extends 2Rw {
    public boolean A00;
    public final C63637L0z A01;
    public final L4J A02;
    public final ArrayList A03 = AnonymousClass7TE.A1C();

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r4, int i) {
        View view;
        View.OnClickListener A012;
        C60636Joj joj = (C60636Joj) r4;
        0qQ.A0B(joj, 0);
        ArrayList arrayList = this.A03;
        if (i < arrayList.size()) {
            L4I l4i = (L4I) DbZ.A0g(arrayList, i);
            joj.A02.setText(l4i.A01);
            view = joj.A00;
            A012 = l4i.A00;
        } else {
            joj.A02.setText(2131962820);
            joj.A01.setImageResource(R.drawable.search_location_small);
            view = joj.A00;
            A012 = LYD.A01(this, 3);
        }
        AnonymousClass0fU.A00(A012, view);
    }

    public C60400Jkt(C63637L0z l0z, L4J l4j) {
        this.A01 = l0z;
        this.A02 = l4j;
    }

    public final int getItemCount() {
        int size;
        int i;
        int A032 = AnonymousClass0fD.A03(-2072208011);
        ArrayList arrayList = this.A03;
        if (arrayList.isEmpty()) {
            size = 0;
            i = 1609468146;
        } else {
            boolean z = this.A00;
            size = arrayList.size();
            if (z) {
                size++;
            }
            i = -1806381611;
        }
        AnonymousClass0fD.A0A(i, A032);
        return size;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return C64005LIl.A01(viewGroup);
    }
}
