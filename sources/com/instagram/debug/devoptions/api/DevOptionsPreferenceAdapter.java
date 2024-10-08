package com.instagram.debug.devoptions.api;

import X.0lg;
import X.AnonymousClass0iw;
import X.AnonymousClass1Q2;
import X.AnonymousClass7TE;
import X.C49605EzO;
import X.C49862FAc;
import X.C50989Fmc;
import X.C67293MlS;
import X.C68504NKx;
import X.C70659OFg;
import X.C70966OTn;
import X.C71277OhI;
import X.FAZ;
import X.FGF;
import X.PR9;
import android.content.Context;
import android.text.TextUtils;
import android.widget.Filter;
import android.widget.Filterable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

public class DevOptionsPreferenceAdapter extends C68504NKx implements Filterable {
    public final Context mContext;
    public final Filter mFilter = new Filter() {
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            int size;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            if (TextUtils.isEmpty(charSequence)) {
                List list = DevOptionsPreferenceAdapter.this.mUnfilteredItems;
                filterResults.values = list;
                size = list.size();
            } else {
                ArrayList A1C = AnonymousClass7TE.A1C();
                HashSet A1F = AnonymousClass7TE.A1F();
                for (Object next : DevOptionsPreferenceAdapter.this.mUnfilteredItems) {
                    if (next instanceof C49605EzO) {
                        A1C.add(next);
                    } else if (DevOptionsPreferenceAdapter.this.matches(next, (String) charSequence) && !A1F.contains(DevOptionsPreferenceAdapter.this.getItemTitle(next))) {
                        A1C.add(next);
                        A1F.add(DevOptionsPreferenceAdapter.this.getItemTitle(next));
                    }
                }
                filterResults.values = A1C;
                size = A1C.size();
            }
            filterResults.count = size;
            return filterResults;
        }

        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            DevOptionsPreferenceAdapter.this.setItems((Collection) filterResults.values);
        }
    };
    public final List mUnfilteredItems = AnonymousClass7TE.A1C();

    /* access modifiers changed from: private */
    public CharSequence getItemTitle(Object obj) {
        if (obj instanceof FGF) {
            return ((FGF) obj).A05;
        }
        if (obj instanceof PR9) {
            PR9 pr9 = (PR9) obj;
            CharSequence charSequence = pr9.A0B;
            if (charSequence == null) {
                return this.mContext.getString(pr9.A04);
            }
            return charSequence;
        } else if (obj instanceof C70659OFg) {
            return this.mContext.getString(((C70659OFg) obj).A02);
        } else {
            if (obj instanceof C67293MlS) {
                return this.mContext.getString(((C67293MlS) obj).A02);
            }
            if (obj instanceof C71277OhI) {
                return ((C71277OhI) obj).A03;
            }
            if (obj instanceof C49862FAc) {
                C49862FAc fAc = (C49862FAc) obj;
                CharSequence charSequence2 = fAc.A07;
                if (charSequence2 == null) {
                    return this.mContext.getString(fAc.A02);
                }
                return charSequence2;
            } else if (obj instanceof C70966OTn) {
                C70966OTn oTn = (C70966OTn) obj;
                CharSequence charSequence3 = oTn.A04;
                if (charSequence3 == null) {
                    return this.mContext.getString(oTn.A01);
                }
                return charSequence3;
            } else if (obj instanceof C50989Fmc) {
                C50989Fmc fmc = (C50989Fmc) obj;
                CharSequence charSequence4 = fmc.A08;
                if (charSequence4 == null) {
                    return this.mContext.getString(fmc.A04);
                }
                return charSequence4;
            } else if (obj instanceof FAZ) {
                return ((FAZ) obj).A07;
            } else {
                return null;
            }
        }
    }

    public Filter getFilter() {
        return this.mFilter;
    }

    public void setTypeaheadHeaderModel(C49605EzO ezO) {
        this.mUnfilteredItems.set(0, ezO);
    }

    public void setUnfilteredItems(List list) {
        if (list == null) {
            list = AnonymousClass7TE.A1C();
        }
        this.mUnfilteredItems.clear();
        this.mUnfilteredItems.addAll(list);
    }

    public DevOptionsPreferenceAdapter(Context context, 0lg r3, AnonymousClass0iw r4) {
        super(context, r3, r4);
        this.mContext = context;
    }

    private String getTitleInitialsLowerCase(String str) {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        for (String str2 : str.toLowerCase(AnonymousClass1Q2.A02()).split(" ")) {
            if (!TextUtils.isEmpty(str2)) {
                int codePointAt = str2.codePointAt(0);
                if (Character.isLetter(codePointAt)) {
                    A1A.appendCodePoint(codePointAt);
                }
            }
        }
        return A1A.toString();
    }

    /* access modifiers changed from: private */
    public boolean matches(Object obj, String str) {
        String str2 = (String) getItemTitle(obj);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        Locale A02 = AnonymousClass1Q2.A02();
        String lowerCase = str.toLowerCase(A02);
        if (str2.toLowerCase(A02).contains(lowerCase) || getTitleInitialsLowerCase(str2).startsWith(lowerCase)) {
            return true;
        }
        return false;
    }
}
