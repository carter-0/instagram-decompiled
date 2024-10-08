package com.instagram.debug.devoptions.search.bootstrap;

import X.002;
import X.2Rw;
import X.AnonymousClass0fD;
import X.AnonymousClass0fU;
import X.C249703kE;
import X.C293645l7;
import X.DbT;
import X.DbU;
import X.JTP;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class BootstrapSurfaceAdapter extends 2Rw {
    public final Delegate mDelegate;
    public final List mSurfaces = new ArrayList();

    public interface Delegate {
        void onSurfaceClick(C293645l7 r1);

        void onSurfaceLongClick(C293645l7 r1);
    }

    public final class SurfaceViewHolder extends C249703kE {
        public final TextView mNameVew;
        public final TextView mRankTokenView;
        public final TextView mScoresCountView;
        public final TextView mTtlView;

        public SurfaceViewHolder(View view) {
            super(view);
            this.mNameVew = DbU.A0G(view, R.id.surface_name);
            this.mRankTokenView = DbU.A0G(view, R.id.surface_rank_token);
            this.mScoresCountView = DbU.A0G(view, R.id.surface_count);
            this.mTtlView = DbU.A0G(view, R.id.surface_ttl);
            AnonymousClass0fU.A00(new View.OnClickListener(BootstrapSurfaceAdapter.this) {
                public void onClick(View view) {
                    int A05 = AnonymousClass0fD.A05(-223152910);
                    SurfaceViewHolder surfaceViewHolder = SurfaceViewHolder.this;
                    BootstrapSurfaceAdapter bootstrapSurfaceAdapter = BootstrapSurfaceAdapter.this;
                    bootstrapSurfaceAdapter.mDelegate.onSurfaceClick((C293645l7) bootstrapSurfaceAdapter.mSurfaces.get(surfaceViewHolder.getBindingAdapterPosition()));
                    AnonymousClass0fD.A0C(570325935, A05);
                }
            }, view);
            view.setOnLongClickListener(new View.OnLongClickListener(BootstrapSurfaceAdapter.this) {
                public boolean onLongClick(View view) {
                    SurfaceViewHolder surfaceViewHolder = SurfaceViewHolder.this;
                    BootstrapSurfaceAdapter bootstrapSurfaceAdapter = BootstrapSurfaceAdapter.this;
                    bootstrapSurfaceAdapter.mDelegate.onSurfaceLongClick((C293645l7) bootstrapSurfaceAdapter.mSurfaces.get(surfaceViewHolder.getBindingAdapterPosition()));
                    return true;
                }
            });
        }

        public void bind(C293645l7 r6) {
            this.mNameVew.setText(r6.A01);
            this.mRankTokenView.setText(002.A0R("Rank Token:\t\t", r6.A02));
            TextView textView = this.mScoresCountView;
            Map map = r6.A03;
            if (map == null) {
                map = Collections.emptyMap();
            }
            textView.setText(002.A0O("Count:\t\t", map.size()));
            this.mTtlView.setText(002.A0e("TTL:\t\t", " seconds.", r6.A00));
        }
    }

    public void onBindViewHolder(SurfaceViewHolder surfaceViewHolder, int i) {
        surfaceViewHolder.bind((C293645l7) this.mSurfaces.get(i));
    }

    public void setSurfaces(List list) {
        this.mSurfaces.clear();
        this.mSurfaces.addAll(list);
        notifyDataSetChanged();
    }

    public BootstrapSurfaceAdapter(Delegate delegate) {
        this.mDelegate = delegate;
    }

    public int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-1480227403);
        int size = this.mSurfaces.size();
        AnonymousClass0fD.A0A(798118539, A03);
        return size;
    }

    public SurfaceViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new SurfaceViewHolder(DbT.A0C(JTP.A0G(viewGroup), viewGroup, R.layout.bootstrap_surface));
    }
}
