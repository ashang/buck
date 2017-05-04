/*
 * Copyright 2015-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.shell;

import com.facebook.buck.model.BuildTarget;
import com.facebook.buck.rules.AbstractNodeBuilderWithImmutableArg;
import com.facebook.buck.rules.SourcePath;
import java.util.Optional;
import javax.annotation.Nullable;

public class ExportFileBuilder
    extends AbstractNodeBuilderWithImmutableArg<
        ExportFileDescriptionArg.Builder, ExportFileDescriptionArg, ExportFileDescription,
        ExportFile> {
  private ExportFileBuilder(BuildTarget target) {
    super(new ExportFileDescription(), target);
  }

  public static ExportFileBuilder newExportFileBuilder(BuildTarget target) {
    return new ExportFileBuilder(target);
  }

  public ExportFileBuilder setSrc(@Nullable SourcePath path) {
    getArgForPopulating().setSrc(Optional.ofNullable(path));
    return this;
  }

  public ExportFileBuilder setOut(String out) {
    getArgForPopulating().setOut(out);
    return this;
  }

  public ExportFileBuilder setMode(ExportFileDescription.Mode mode) {
    getArgForPopulating().setMode(mode);
    return this;
  }
}
