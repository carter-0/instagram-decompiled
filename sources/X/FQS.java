package X;

import android.content.Context;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class FQS implements ListAdapter {
    public String A00 = "";
    public final Comparator A01 = C51565FwB.A00;
    public final List A02 = AnonymousClass7TE.A1C();
    public final Context A03;
    public final DataSetObservable A04 = new DataSetObservable();
    public final List A05 = AnonymousClass7TE.A1C();

    public final boolean areAllItemsEnabled() {
        return true;
    }

    public final int getItemViewType(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        EyA eyA;
        String str;
        AnonymousClass4V7 r0;
        ViewGroup viewGroup2 = viewGroup;
        0qQ.A0B(viewGroup2, 2);
        if (view == null) {
            view = DbU.A0A(LayoutInflater.from(this.A03), viewGroup2, R.layout.quick_promotion_slot_item, false);
            eyA = new EyA(view);
            view.setTag(eyA);
        } else {
            Object tag = view.getTag();
            if (tag != null) {
                eyA = (EyA) tag;
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        F3N f3n = (F3N) getItem(i);
        if (f3n != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Map map = f3n.A03;
            Iterator A0u = AnonymousClass7TF.A0u(f3n.A02);
            int i2 = 0;
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                List<C283795Ji> list = (List) A1J.getValue();
                QuickPromotionSurface quickPromotionSurface = ((C227972ka) A1J.getKey()).A00;
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("\n");
                String name = quickPromotionSurface.name();
                Locale locale = Locale.getDefault();
                0qQ.A07(locale);
                String A12 = DbT.A12(locale, name);
                A1A.append(A12);
                A1A.append("\n");
                SpannableString spannableString = new SpannableString(002.A0g("\n", A12, "\n"));
                spannableString.setSpan(new C305766Jl(), 0, A1A.length(), 0);
                spannableStringBuilder.append(spannableString);
                if (list == null || list.isEmpty()) {
                    spannableStringBuilder.append("No QPs\n");
                } else {
                    for (C283795Ji r9 : list) {
                        AnonymousClass5Jm r8 = r9.A02;
                        0qQ.A07(r8);
                        SpannableStringBuilder append = spannableStringBuilder.append("\"");
                        List list2 = r8.A06;
                        String str2 = "";
                        if (list2 == null || (r0 = (AnonymousClass4V7) 00k.A0J(list2)) == null || (str = r0.A09.A00) == null) {
                            str = str2;
                        }
                        append.append(str).append("\" ");
                        Object obj = map.get(r9.A02.A05);
                        if (obj != null) {
                            FEW few = (FEW) obj;
                            String str3 = few.A00;
                            if (str3 != null) {
                                str2 = str3;
                            }
                            if (few.A02) {
                                spannableStringBuilder.append(" is qualified.\n");
                                if (few.A01) {
                                    spannableStringBuilder.append(str2);
                                }
                                i2++;
                            } else {
                                spannableStringBuilder.append("is not qualified: ").append(str2).append(".\n");
                            }
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    }
                    continue;
                }
            }
            eyA.A02.setText(C49082Ep0.A00(f3n));
            TextView textView = eyA.A01;
            String format = String.format("%d qualified promotion(s)", Arrays.copyOf(AnonymousClass7TF.A1b(i2), 1));
            0qQ.A07(format);
            textView.setText(format);
            eyA.A00.setText(spannableStringBuilder);
            return view;
        }
        throw AnonymousClass7TE.A15(002.A0O("Failed to get an item at position ", i));
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final boolean hasStableIds() {
        return true;
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        0qQ.A0B(dataSetObserver, 0);
        this.A04.registerObserver(dataSetObserver);
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        0qQ.A0B(dataSetObserver, 0);
        this.A04.unregisterObserver(dataSetObserver);
    }

    public static final void A00(FQS fqs) {
        List list = fqs.A05;
        list.clear();
        for (F3N f3n : fqs.A02) {
            if (DbU.A1a(AnonymousClass7TF.A0j(C49082Ep0.A00(f3n)), fqs.A00)) {
                list.add(f3n);
            }
        }
        boolean isEmpty = list.isEmpty();
        DataSetObservable dataSetObservable = fqs.A04;
        if (!isEmpty) {
            dataSetObservable.notifyChanged();
        } else {
            dataSetObservable.notifyInvalidated();
        }
    }

    public final int getCount() {
        return this.A05.size();
    }

    public final Object getItem(int i) {
        List list = this.A05;
        if (list.size() > i) {
            return list.get(i);
        }
        return null;
    }

    public FQS(Context context) {
        this.A03 = context;
    }

    public final long getItemId(int i) {
        F3N f3n = (F3N) getItem(i);
        if (f3n != null) {
            return (long) f3n.A00.ordinal();
        }
        return -1;
    }

    public final boolean isEmpty() {
        return AnonymousClass7TF.A1Q(getCount());
    }

    public final boolean isEnabled(int i) {
        return AnonymousClass7TF.A1V(getItem(i));
    }
}
