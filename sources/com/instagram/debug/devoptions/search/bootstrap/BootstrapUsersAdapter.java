package com.instagram.debug.devoptions.search.bootstrap;

import X.2Rw;
import X.AnonymousClass0fD;
import X.AnonymousClass0fU;
import X.AnonymousClass0iw;
import X.C249703kE;
import X.C293645l7;
import X.DbT;
import X.DbU;
import X.DbV;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public class BootstrapUsersAdapter extends 2Rw {
    public final AnonymousClass0iw mAnalyticsModule;
    public final Delegate mDelegate;
    public final List mFilteredUsers = new ArrayList();
    public final C293645l7 mSurface;
    public final List mUnfilteredUsers = new ArrayList();

    public interface Delegate {
        void onUserClick(BootstrapUserInfo bootstrapUserInfo);

        void onUserLongClick(BootstrapUserInfo bootstrapUserInfo);
    }

    public class UserInfoViewHolder extends C249703kE {
        public final CircularImageView mAvatarView;
        public final TextView mOtherScoresView;
        public final TextView mRankView;
        public final TextView mScoreView;
        public final TextView mUserIdView;
        public final TextView mUsernameView;

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x005f, code lost:
            r2 = X.AnonymousClass7TE.A1J(r3);
            r1 = X.DbT.A13(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x006b, code lost:
            if (r1.equals(r5) != false) goto L_0x0059;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x006d, code lost:
            r4.append(r1);
            r4.append(":\n\t");
            r4.append(r2.getValue());
            r4.append("\n");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x008c, code lost:
            if (r3.size() >= 1) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x008f, code lost:
            r7.mOtherScoresView.setText(r4.toString());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0098, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0099, code lost:
            r7.mOtherScoresView.setVisibility(8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a0, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0047, code lost:
            if (r3.size() >= 2) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0049, code lost:
            r7.mOtherScoresView.setVisibility(0);
            r4 = new java.lang.StringBuilder("Also appears in:\n");
            r3 = X.AnonymousClass7TF.A0u(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x005d, code lost:
            if (r3.hasNext() == false) goto L_0x008f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void bindScores(com.instagram.debug.devoptions.search.bootstrap.BootstrapUserInfo r8) {
            /*
                r7 = this;
                java.util.Map r3 = r8.surfaceToScoreMap
                com.instagram.debug.devoptions.search.bootstrap.BootstrapUsersAdapter r0 = com.instagram.debug.devoptions.search.bootstrap.BootstrapUsersAdapter.this
                X.5l7 r0 = r0.mSurface
                java.lang.String r5 = r0.A01
                java.util.Iterator r6 = X.AnonymousClass7TF.A0u(r3)
            L_0x000c:
                boolean r0 = r6.hasNext()
                r2 = 1
                r4 = 0
                if (r0 == 0) goto L_0x0082
                java.lang.Object r1 = X.C13991Tnr.A0Y(r6)
                java.lang.String r1 = (java.lang.String) r1
                com.instagram.debug.devoptions.search.bootstrap.BootstrapUsersAdapter r0 = com.instagram.debug.devoptions.search.bootstrap.BootstrapUsersAdapter.this
                X.5l7 r0 = r0.mSurface
                java.lang.String r0 = r0.A01
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x000c
                android.widget.TextView r0 = r7.mScoreView
                r0.setVisibility(r4)
                android.widget.TextView r2 = r7.mScoreView
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "Score: "
                r1.append(r0)
                java.lang.Object r0 = r3.get(r5)
                java.lang.String r0 = X.AnonymousClass7TF.A0i(r0, r1)
                r2.setText(r0)
                int r1 = r3.size()
                r0 = 2
                if (r1 < r0) goto L_0x0099
            L_0x0049:
                android.widget.TextView r0 = r7.mOtherScoresView
                r0.setVisibility(r4)
                java.lang.String r0 = "Also appears in:\n"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>(r0)
                java.util.Iterator r3 = X.AnonymousClass7TF.A0u(r3)
            L_0x0059:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x008f
                java.util.Map$Entry r2 = X.AnonymousClass7TE.A1J(r3)
                java.lang.String r1 = X.DbT.A13(r2)
                boolean r0 = r1.equals(r5)
                if (r0 != 0) goto L_0x0059
                r4.append(r1)
                java.lang.String r0 = ":\n\t"
                r4.append(r0)
                java.lang.Object r0 = r2.getValue()
                r4.append(r0)
                java.lang.String r0 = "\n"
                r4.append(r0)
                goto L_0x0059
            L_0x0082:
                android.widget.TextView r1 = r7.mScoreView
                r0 = 4
                r1.setVisibility(r0)
                int r0 = r3.size()
                if (r0 < r2) goto L_0x0099
                goto L_0x0049
            L_0x008f:
                android.widget.TextView r1 = r7.mOtherScoresView
                java.lang.String r0 = r4.toString()
                r1.setText(r0)
                return
            L_0x0099:
                android.widget.TextView r1 = r7.mOtherScoresView
                r0 = 8
                r1.setVisibility(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.search.bootstrap.BootstrapUsersAdapter.UserInfoViewHolder.bindScores(com.instagram.debug.devoptions.search.bootstrap.BootstrapUserInfo):void");
        }

        /* JADX WARNING: type inference failed for: r2v1, types: [android.view.View] */
        /* JADX WARNING: type inference failed for: r2v3 */
        /* JADX WARNING: type inference failed for: r2v4 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void bind(com.instagram.debug.devoptions.search.bootstrap.BootstrapUserInfo r4) {
            /*
                r3 = this;
                com.instagram.user.model.User r0 = r4.user
                com.instagram.common.typedurl.ImageUrl r0 = r0.Bh3()
                boolean r0 = X.C253833rU.A02(r0)
                com.instagram.common.ui.widget.imageview.CircularImageView r2 = r3.mAvatarView
                if (r0 != 0) goto L_0x003e
                com.instagram.user.model.User r0 = r4.user
                com.instagram.common.typedurl.ImageUrl r1 = r0.Bh3()
                com.instagram.debug.devoptions.search.bootstrap.BootstrapUsersAdapter r0 = com.instagram.debug.devoptions.search.bootstrap.BootstrapUsersAdapter.this
                X.0iw r0 = r0.mAnalyticsModule
                r2.setUrl(r1, r0)
                com.instagram.common.ui.widget.imageview.CircularImageView r2 = r3.mAvatarView
                r0 = 0
            L_0x001e:
                r2.setVisibility(r0)
                android.widget.TextView r1 = r3.mRankView
                int r0 = r4.rank
                X.C13988Tno.A15(r1, r0)
                android.widget.TextView r1 = r3.mUsernameView
                com.instagram.user.model.User r0 = r4.user
                X.DbU.A1H(r1, r0)
                android.widget.TextView r1 = r3.mUserIdView
                com.instagram.user.model.User r0 = r4.user
                java.lang.String r0 = r0.getId()
                r1.setText(r0)
                r3.bindScores(r4)
                return
            L_0x003e:
                r0 = 4
                goto L_0x001e
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.search.bootstrap.BootstrapUsersAdapter.UserInfoViewHolder.bind(com.instagram.debug.devoptions.search.bootstrap.BootstrapUserInfo):void");
        }

        /* renamed from: lambda$new$0$com-instagram-debug-devoptions-search-bootstrap-BootstrapUsersAdapter$UserInfoViewHolder  reason: not valid java name */
        public /* synthetic */ void m23lambda$new$0$cominstagramdebugdevoptionssearchbootstrapBootstrapUsersAdapter$UserInfoViewHolder(View view) {
            BootstrapUsersAdapter bootstrapUsersAdapter = BootstrapUsersAdapter.this;
            bootstrapUsersAdapter.mDelegate.onUserClick((BootstrapUserInfo) bootstrapUsersAdapter.mFilteredUsers.get(getBindingAdapterPosition()));
        }

        /* renamed from: lambda$new$1$com-instagram-debug-devoptions-search-bootstrap-BootstrapUsersAdapter$UserInfoViewHolder  reason: not valid java name */
        public /* synthetic */ boolean m24lambda$new$1$cominstagramdebugdevoptionssearchbootstrapBootstrapUsersAdapter$UserInfoViewHolder(View view) {
            BootstrapUsersAdapter bootstrapUsersAdapter = BootstrapUsersAdapter.this;
            bootstrapUsersAdapter.mDelegate.onUserLongClick((BootstrapUserInfo) bootstrapUsersAdapter.mFilteredUsers.get(getBindingAdapterPosition()));
            return true;
        }

        public UserInfoViewHolder(View view) {
            super(view);
            this.mAvatarView = DbU.A0X(view, R.id.avatar);
            this.mRankView = DbU.A0G(view, R.id.rank);
            this.mUsernameView = DbU.A0G(view, R.id.username);
            this.mUserIdView = DbU.A0G(view, R.id.user_id);
            this.mScoreView = DbU.A0G(view, R.id.score);
            this.mOtherScoresView = DbU.A0G(view, R.id.other_scores);
            AnonymousClass0fU.A00(new BootstrapUsersAdapter$UserInfoViewHolder$$ExternalSyntheticLambda0(this), view);
            view.setOnLongClickListener(new BootstrapUsersAdapter$UserInfoViewHolder$$ExternalSyntheticLambda1(this));
        }
    }

    private boolean matchesFilter(BootstrapUserInfo bootstrapUserInfo, String str) {
        User user = bootstrapUserInfo.user;
        user.getUsername();
        if (user.getUsername().startsWith(str) || ((user.getFullName() != null && user.getFullName().startsWith(str)) || user.getId().startsWith(str))) {
            return true;
        }
        return false;
    }

    public void applyFilterText(String str) {
        this.mFilteredUsers.clear();
        if (TextUtils.isEmpty(str)) {
            this.mFilteredUsers.addAll(this.mUnfilteredUsers);
        } else {
            for (BootstrapUserInfo bootstrapUserInfo : this.mUnfilteredUsers) {
                if (matchesFilter(bootstrapUserInfo, str)) {
                    this.mFilteredUsers.add(bootstrapUserInfo);
                }
            }
        }
        notifyDataSetChanged();
    }

    public void onBindViewHolder(UserInfoViewHolder userInfoViewHolder, int i) {
        userInfoViewHolder.bind((BootstrapUserInfo) this.mFilteredUsers.get(i));
    }

    public void setUnfilteredUsers(List list) {
        this.mUnfilteredUsers.clear();
        this.mUnfilteredUsers.addAll(list);
        applyFilterText("");
    }

    public BootstrapUsersAdapter(AnonymousClass0iw r2, Delegate delegate, C293645l7 r4) {
        this.mAnalyticsModule = r2;
        this.mDelegate = delegate;
        this.mSurface = r4;
    }

    public int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-1292144059);
        int size = this.mFilteredUsers.size();
        AnonymousClass0fD.A0A(-1675213805, A03);
        return size;
    }

    public UserInfoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new UserInfoViewHolder(DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.bootstrap_user_info));
    }
}
