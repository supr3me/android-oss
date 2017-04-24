package com.kickstarter.ui.viewholders;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.kickstarter.R;

import butterknife.Bind;
import butterknife.BindString;

public final class FeaturedSearchResultViewHolder extends ProjectSearchResultViewHolder {

  @Bind(R.id.search_term_text_view) TextView termTextView;
  @BindString(R.string.search_most_popular) String mostPopularString;

  public FeaturedSearchResultViewHolder(final @NonNull View view, final @NonNull Delegate delegate) {
    super(view, delegate);
  }

  @Override
  public void bindData(final @Nullable Object data) throws Exception {
    super.bindData(data);
    termTextView.setText(mostPopularString);
  }
}