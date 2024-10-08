package com.instagram.debug.devoptions.search.bootstrap;

import X.2Rw;
import X.AnonymousClass0fD;
import X.AnonymousClass0fU;
import X.C249703kE;
import X.DbT;
import X.DbU;
import X.JTP;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.model.keyword.Keyword;
import java.util.ArrayList;
import java.util.List;

public class BootstrapKeywordAdapter extends 2Rw {
    public final Delegate mDelegate;
    public final List mFilteredUsers = new ArrayList();
    public final List mUnfilteredUsers = new ArrayList();

    public interface Delegate {
        void onKeywordClick(Keyword keyword);

        void onKeywordLongClick(Keyword keyword);
    }

    public void applyFilterText(String str) {
        this.mFilteredUsers.clear();
        if (TextUtils.isEmpty(str)) {
            this.mFilteredUsers.addAll(this.mUnfilteredUsers);
        } else {
            for (Keyword keyword : this.mUnfilteredUsers) {
                String str2 = keyword.A04;
                if (str2 != null && str2.startsWith(str)) {
                    this.mFilteredUsers.add(keyword);
                }
            }
        }
        notifyDataSetChanged();
    }

    public void onBindViewHolder(Holder holder, final int i) {
        String str = ((Keyword) this.mFilteredUsers.get(i)).A04;
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        TextView textView = holder.nameTextView;
        if (str == null) {
            str = "[null]";
        }
        textView.setText(str);
        AnonymousClass0fU.A00(new View.OnClickListener() {
            public void onClick(View view) {
                int A05 = AnonymousClass0fD.A05(464962207);
                BootstrapKeywordAdapter bootstrapKeywordAdapter = BootstrapKeywordAdapter.this;
                bootstrapKeywordAdapter.mDelegate.onKeywordClick((Keyword) bootstrapKeywordAdapter.mFilteredUsers.get(i));
                AnonymousClass0fD.A0C(-159326874, A05);
            }
        }, holder.parentView);
        holder.parentView.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View view) {
                BootstrapKeywordAdapter bootstrapKeywordAdapter = BootstrapKeywordAdapter.this;
                bootstrapKeywordAdapter.mDelegate.onKeywordLongClick((Keyword) bootstrapKeywordAdapter.mFilteredUsers.get(i));
                return true;
            }
        });
    }

    public void setUnfilteredUsers(List list) {
        this.mUnfilteredUsers.clear();
        this.mUnfilteredUsers.addAll(list);
        applyFilterText("");
    }

    public BootstrapKeywordAdapter(Delegate delegate) {
        this.mDelegate = delegate;
    }

    public int getItemCount() {
        int A03 = AnonymousClass0fD.A03(1947675656);
        int size = this.mFilteredUsers.size();
        AnonymousClass0fD.A0A(-1787644650, A03);
        return size;
    }

    public Holder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new Holder(DbT.A0C(JTP.A0G(viewGroup), viewGroup, R.layout.bootstrap_keyword_info));
    }

    public class Holder extends C249703kE {
        public final TextView nameTextView;
        public final View parentView;

        public Holder(View view) {
            super(view);
            this.parentView = view;
            this.nameTextView = DbU.A0G(view, R.id.keyword_name);
        }
    }
}
